package Commands;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;

public class writeFile {
    public static void callMe(String message) {
        BufferedWriter bw = null;
        try {
            //Specify the file name and path here
            File file = new File("myfile.txt");
            /* This logic will make sure that the file
            * gets created if it is not present at the
            * specified location*/
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            out.write(message + "\n");
            System.out.println("File written Successfully");
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
    public static void callMe2(String message, String class2) {
        try {
            // input the file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader("myfile.txt"));
            String line;
            StringBuffer inputBuffer = new StringBuffer();

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            String inputStr = inputBuffer.toString();

            file.close();

            System.out.println(inputStr); // check that it's inputted right

            // this if structure determines whether or not to replace "0" or "1"
            inputStr = inputStr.replace(message, message + " " + class2);

            // write the new String with the replaced line OVER the same file
            FileOutputStream fileOut = new FileOutputStream("myfile.txt");
            fileOut.write(inputStr.getBytes());
            fileOut.close();

        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }
    }
}
package Commands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    private static final String FILENAME = "myfile.txt";

    public static boolean callMe(String user) {
        BufferedReader br = null;
        FileReader fr = null;
        try {
            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                if(sCurrentLine.contains(user)){
                    return true;
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }
    public static boolean callMe2(String user) {
        BufferedReader br = null;
        FileReader fr = null;
        try {
            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                if(sCurrentLine.equals(user)){
                    return true;
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }
    public static Character callMe3(String user) {
        BufferedReader br = null;
        FileReader fr = null;
        try {
            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                if(sCurrentLine.contains(user)){
                    return sCurrentLine.charAt(sCurrentLine.length()-1);
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}
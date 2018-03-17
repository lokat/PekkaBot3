package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

public class sHonor {
    public static int callMe(MessageReceivedEvent event, String message, int counter) {
        if (message.equalsIgnoreCase("p!shonor")) {
            event.getTextChannel().sendMessage(Constants.sHonorListHelp).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!shonor 1")) {
            if(readFile.callMe3(event.getMessage().getAuthor().toString())=='s')
                event.getTextChannel().sendMessage(Constants.sHonorListS0).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            else if(readFile.callMe3(event.getMessage().getAuthor().toString())=='a')
                event.getTextChannel().sendMessage(Constants.sHonorListA0).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            else
                event.getTextChannel().sendMessage(Constants.sHonorListM0).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));

            counter++;
        }else if (message.equalsIgnoreCase("p!shonor 40")) {
            if(readFile.callMe3(event.getMessage().getAuthor().toString())=='s')
                event.getTextChannel().sendMessage(Constants.sHonorListS40).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            else if(readFile.callMe3(event.getMessage().getAuthor().toString())=='a')
                event.getTextChannel().sendMessage(Constants.sHonorListA40).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            else
                event.getTextChannel().sendMessage(Constants.sHonorListM40).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));

            counter++;
        }
        return counter;
    }
}
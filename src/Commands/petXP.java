package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

public class petXP {
    public static int callMe(MessageReceivedEvent event, String message,int counter) {
        if (message.equalsIgnoreCase("p!petxp")) {
            event.getTextChannel().sendMessage(Constants.petXP).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }
        if (message.equalsIgnoreCase("p!petxp 0")) {
            event.getTextChannel().sendMessage(Constants.petXP0).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        }
        if (message.equalsIgnoreCase("p!petxp 20")) {
            event.getTextChannel().sendMessage(Constants.petXP20).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        }
        if (message.equalsIgnoreCase("p!petxp 40")) {
            event.getTextChannel().sendMessage(Constants.petXP40).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        }
        if (message.equalsIgnoreCase("p!petxp 60")) {
            event.getTextChannel().sendMessage(Constants.petXP60).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        }
        if (message.equalsIgnoreCase("p!petxp 80")) {
            event.getTextChannel().sendMessage(Constants.petXP80).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        }
        return counter;
    }
}

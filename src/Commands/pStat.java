package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

public class pStat {
    public static int callMe(MessageReceivedEvent event, String message, int counter){
        if (message.equalsIgnoreCase("p!pstat")) {
            event.getTextChannel().sendMessage(Constants.MVPHelp).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pstat 1")) {
            event.getTextChannel().sendMessage("```Apache\nMVP_Pets_Level_1\n```").queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            event.getTextChannel().sendMessage(Constants.l1MVP).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            event.getTextChannel().sendMessage(Constants.l1MVPL).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pStat 30")) {
            event.getTextChannel().sendMessage("```Apache\nMVP_Pets_Level_30\n```").queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            event.getTextChannel().sendMessage(Constants.l30MVP).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            event.getTextChannel().sendMessage(Constants.l30MVPL).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pStat 60")) {
            event.getTextChannel().sendMessage("```Apache\nMVP_Pets_Level_60\n```").queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            event.getTextChannel().sendMessage(Constants.l60MVP).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            event.getTextChannel().sendMessage(Constants.l60MVPL).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        }
        else if(message.equalsIgnoreCase("p!pStat 90")){
            event.getTextChannel().sendMessage("```Apache\nMVP_Pets_Level_90\n```").queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            event.getTextChannel().sendMessage(Constants.l90MVP).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            event.getTextChannel().sendMessage(Constants.l90MVPL).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
        }
        return counter;
    }
}

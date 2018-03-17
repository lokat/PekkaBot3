package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.PermissionException;

import java.util.concurrent.TimeUnit;

public class emoji {
    public static void callMe(MessageReceivedEvent event, String message){
        if(message.equalsIgnoreCase("p!emoji")){
            event.getTextChannel().sendMessage(Constants.emojiList).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
        }
        if(message.equalsIgnoreCase("p!emoji profile")){
            try{event.getMessage().delete().queue();}catch (PermissionException e){}
            event.getTextChannel().sendMessage("<:petme:392210462747525120>").queue();
        }
        if(message.equalsIgnoreCase("p!emoji dangoB")){
            try{event.getMessage().delete().queue();}catch (PermissionException e){}
            event.getTextChannel().sendMessage("<:dangoB:392215978685235200>").queue();
        }
        if(message.equalsIgnoreCase("p!emoji dangoY")){
            try{event.getMessage().delete().queue();}catch (PermissionException e){}
            event.getTextChannel().sendMessage("<:dangoY:392215978760470528>").queue();
        }
        if(message.equalsIgnoreCase("p!emoji dangoP")){
            try{event.getMessage().delete().queue();}catch (PermissionException e){}
            event.getTextChannel().sendMessage("<:dangoP:392215978752344064>").queue();
        }
    }
}

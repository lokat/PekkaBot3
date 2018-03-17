import Commands.*;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.PermissionException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.Permission;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MessageRespond extends ListenerAdapter {
    //Random Variable
    private boolean truthorfalse = false;
    public int counter = 0;
    //Message Received
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        try {
            String message = event.getMessage().getContent().toLowerCase();
            //Commands
            if (!event.isFromType(ChannelType.PRIVATE) && message.startsWith("p!")) {
                //Help
                if (message.startsWith("p!help")) {
                    event.getTextChannel().sendMessage("All of the commands PekkaBot has. PekkaBot is case insensitive.").queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS,onSuccess -> {}, Throwable::printStackTrace)));
                    EmbedBuilder builder = new EmbedBuilder();
                    builder.setTitle("Help Menu");
                    builder.setDescription("```Apache\n" +
                            "[Command]      : [Description]\n" +
                            "hello          : Say hello\n" +
                            "rebirth        : Lists Rebirth info\n" +
                            "pet            : List the pets ID Card\n" +
                            "skill          : Lists skill info\n" +
                            "pStat          : MVP Stats\n" +
                            "pSkill         : Combat Skills\n" +
                            "rune           : Runes\n" +
                            "addMe          : Link to add PekkaBot```");
                    builder.setColor(Color.PINK);
                    builder.setThumbnail("https://i.imgur.com/auDyHRI.gif");
                    builder.setAuthor("Pekka's Bestest Most Opest Bot", "https://discordapp.com", "https://panel.talonro.com/images/monster/1002.gif");
                    builder.setFooter("Poring |","https://panel.talonro.com/images/monster/1002.gif");
                    event.getTextChannel().sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS,onSuccess -> {}, Throwable::printStackTrace)));
                    event.getTextChannel().sendMessage("Pekka Bot will be going down at the end of March. If you need more info or would like to recieve a copy of this bot, please type `p!server` or pm <@218781547854168064>").queue((message2 -> message2.delete().queueAfter(30, TimeUnit.SECONDS)));
                    counter++;
                }
                if (message.equalsIgnoreCase("p!rebirth")) {
                    event.getTextChannel().sendMessage(Constants.rebirth).queue();
                    counter++;
                }
                //Add Me
                if (message.equalsIgnoreCase("p!addme")) {
                    event.getTextChannel().sendMessage(Constants.addME).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
                    counter++;
                }
                if(message.equalsIgnoreCase("p!server")){
                    event.getTextChannel().sendMessage("https://discord.gg/zTMhK6n").queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
                    counter++;
                }
                //Hello
                if (message.startsWith("p!hello")) {
                    event.getTextChannel().sendMessage("Go away <@" + event.getAuthor().getId() + ">").queue();
                    counter++;
                }
                //Emoji
                if(message.startsWith("p!emoji")){
                    emoji.callMe(event,message);
                }
                //Pet
                if (message.startsWith("p!pet"))
                    counter = pet.callMe(event, message, counter);
                //Pet Skill
                if (message.startsWith("p!pskill"))
                    counter = pSkill.callMe(event, message, counter);
                //Pet Skill
                if (message.startsWith("p!skill"))
                    counter = skill.callMe(event, message, counter);
                //Rune
                if (message.startsWith("p!rune"))
                    counter = rune.callMe(event, message, counter);
                //Pet Stat
                if (message.startsWith("p!pstat"))
                    counter = pStat.callMe(event, message, counter);
                //System.out.println(counter);
                if (counter == 0) {
                    counter++;
                    //message = spellCheck.startSimulation(message);
                    //callMe(event,message);
                }
                if (counter > 0) {
                    counter = 0;
                }
            }
        }
        catch(PermissionException e){
            event.getJDA().getTextChannelById(367184310563766276L).sendMessage("Error <@218781547854168064>\nGuild: " + event.getGuild().getName()+": " + event.getGuild().getId()+"\nUser: <@"+event.getAuthor().getId() + ">").queue();
            event.getJDA().getTextChannelById(367184310563766276L).sendMessage("Permission: " + e.getPermission().getName()).queue();
            //event.getJDA().getTextChannelById(367184310563766276L).sendMessage("Cause: " + e.getCause().getMessage()).queue();
            /* also some recommendations:
                first - you should catch a more specific exception if possible (this can catch any exception which might be unintended)
                second - please use getName() rather than toString() (toString is a method provided by the Object class, it isn't usually overridden)
                third - you should put your code into a single if statement rather than incrementing a counter, and to make that neater you could simplify your code a bit
                fourth - you should use variables more so as to clean up and organise your code a lil better.
                fifth - similarly to third: please contain your code in one scope rather than relying on the class' scope.
            */
       }
    }
}
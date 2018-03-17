package Commands;


import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

public class skill {
    public static int callMe(MessageReceivedEvent event, String message, int counter) {
        if (message.equalsIgnoreCase("p!skill")) {
            event.getTextChannel().sendMessage("Please enter a skill name.").queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill mindblow")||message.equalsIgnoreCase("p!skill bash")||message.equalsIgnoreCase("p!skill brutal arrow")) {
            event.getTextChannel().sendMessage(Constants.Mindblow).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill magical shock")||message.equalsIgnoreCase("p!skill fatal blow")||message.equalsIgnoreCase("p!skill power arrow")) {
            event.getTextChannel().sendMessage(Constants.MagicalShock).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill magical double hit")||message.equalsIgnoreCase("p!skill multiple attack")||message.equalsIgnoreCase("p!skill double strafe")) {
            event.getTextChannel().sendMessage(Constants.MagicalDouble).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill stone curse")||message.equalsIgnoreCase("p!skill frost blade")||message.equalsIgnoreCase("p!skill frost bolt")) {
            event.getTextChannel().sendMessage(Constants.StoneCurse).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill sleep")||message.equalsIgnoreCase("p!skill sleeping blade")||message.equalsIgnoreCase("p!skill sleep bolt")) {
            event.getTextChannel().sendMessage(Constants.Sleep).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill silence")||message.equalsIgnoreCase("p!skill blade of silence")||message.equalsIgnoreCase("p!skill silence bolt")) {
            event.getTextChannel().sendMessage(Constants.Silence).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill element focus")||message.equalsIgnoreCase("p!skill spear dynamo")||message.equalsIgnoreCase("p!skill meditation")) {
            event.getTextChannel().sendMessage(Constants.ElementFocus).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill dexterity")||message.equalsIgnoreCase("p!skill windwalker")) {
            event.getTextChannel().sendMessage(Constants.Dexterity).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill mental power")||message.equalsIgnoreCase("p!skill triple action")||message.equalsIgnoreCase("p!skill triple strafe")) {
            event.getTextChannel().sendMessage(Constants.MentalPower).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill curse magic")||message.equalsIgnoreCase("p!skill cursed blade")||message.equalsIgnoreCase("p!skill curse bolt")) {
            event.getTextChannel().sendMessage(Constants.CurseMagic).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill energy reflection")||message.equalsIgnoreCase("p!skill furious blow")||message.equalsIgnoreCase("p!skill fury arrow")) {
            event.getTextChannel().sendMessage(Constants.EnergyReflection).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill element bomb")||message.equalsIgnoreCase("p!skill charged attack")||message.equalsIgnoreCase("p!skill aimed bolt")) {
            event.getTextChannel().sendMessage(Constants.ElementBomb).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill thunderous shot")||message.equalsIgnoreCase("p!skill vital strike")||message.equalsIgnoreCase("p!skill falcon eyes")) {
            event.getTextChannel().sendMessage(Constants.ThunderousShot).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill fire wall")||message.equalsIgnoreCase("p!skill pierce")||message.equalsIgnoreCase("p!skill ghost arrow")) {
            event.getTextChannel().sendMessage(Constants.FireWall).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill magical chase")||message.equalsIgnoreCase("p!skill traumatic blow")||message.equalsIgnoreCase("p!skill vulnerability mark")) {
            event.getTextChannel().sendMessage(Constants.MagicalChase).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill energy transfer")||message.equalsIgnoreCase("p!skill blade of blood")||message.equalsIgnoreCase("p!skill blood steal")) {
            event.getTextChannel().sendMessage(Constants.EnergyTransfer).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }else if (message.equalsIgnoreCase("p!skill energy coat")||message.equalsIgnoreCase("p!skill endure")||message.equalsIgnoreCase("p!skill guardian")) {
            event.getTextChannel().sendMessage(Constants.EnergyCoat).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        }
        return counter;
    }
}
package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

public class rune {
    public static int callMe(MessageReceivedEvent event, String message, int counter) {
        if (message.equalsIgnoreCase("p!rune")) {
            event.getTextChannel().sendMessage(Constants.runeHelp).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Ad") || message.equalsIgnoreCase("p!rune Adamzat")) {
            event.getTextChannel().sendMessage(Constants.runeAd).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Ar") || message.equalsIgnoreCase("p!rune Aries")) {
            event.getTextChannel().sendMessage(Constants.runeAr).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune As") || message.equalsIgnoreCase("p!rune Asthayi")) {
            event.getTextChannel().sendMessage(Constants.runeAs).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Ce") || message.equalsIgnoreCase("p!rune Celeritas")) {
            event.getTextChannel().sendMessage(Constants.runeCe).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Ci") || message.equalsIgnoreCase("p!rune Ciernie")) {
            event.getTextChannel().sendMessage(Constants.runeCi).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune De") || message.equalsIgnoreCase("p!rune Desita")) {
            event.getTextChannel().sendMessage(Constants.runeDe).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Enk") || message.equalsIgnoreCase("p!rune Enkeli")) {
            event.getTextChannel().sendMessage(Constants.runeEnk).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Enn") || message.equalsIgnoreCase("p!rune Ennerwelt")) {
            event.getTextChannel().sendMessage(Constants.runeEnn).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Er") || message.equalsIgnoreCase("p!rune Era")) {
            event.getTextChannel().sendMessage(Constants.runeEr).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Fla") || message.equalsIgnoreCase("p!rune Flamma")) {
            event.getTextChannel().sendMessage(Constants.runeFla).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Flu") || message.equalsIgnoreCase("p!rune Fluo")) {
            event.getTextChannel().sendMessage(Constants.runeFlu).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Ha") || message.equalsIgnoreCase("p!rune Haere")) {
            event.getTextChannel().sendMessage(Constants.runeHa).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Ia") || message.equalsIgnoreCase("p!rune Iawanan")) {
            event.getTextChannel().sendMessage(Constants.runeIa).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Iy") || message.equalsIgnoreCase("p!rune Iyali")) {
            event.getTextChannel().sendMessage(Constants.runeIy).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Kup") || message.equalsIgnoreCase("p!rune Kupona")) {
            event.getTextChannel().sendMessage(Constants.runeKup).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Kuu") || message.equalsIgnoreCase("p!rune Kuura")) {
            event.getTextChannel().sendMessage(Constants.runeKuu).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Op") || message.equalsIgnoreCase("p!rune Opari")) {
            event.getTextChannel().sendMessage(Constants.runeOp).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Ta") || message.equalsIgnoreCase("p!rune Taika")) {
            event.getTextChannel().sendMessage(Constants.runeTa).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!rune Vl") || message.equalsIgnoreCase("p!rune Vald") || message.equalsIgnoreCase("p!rune Vald")) {
            event.getTextChannel().sendMessage(Constants.runeVl).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        }
        return counter;
    }
}

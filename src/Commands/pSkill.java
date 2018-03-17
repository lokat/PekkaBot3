package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

public class pSkill {
    public static int callMe(MessageReceivedEvent event, String message,int counter) {
        if (message.equalsIgnoreCase("p!pSkill")) {
            event.getTextChannel().sendMessage(Constants.petSkillHelp).queue((message2 -> message2.delete().queueAfter(120, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill AS") || message.equalsIgnoreCase("p!pSkill Attack Strengthen")) {
            event.getTextChannel().sendMessage((Constants.pskillAS)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill AW") || message.equalsIgnoreCase("p!pSkill Awaken")) {
            event.getTextChannel().sendMessage((Constants.pskillAW)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill BS") || message.equalsIgnoreCase("p!pSkill Bloodshot")) {
            event.getTextChannel().sendMessage((Constants.pskillBS)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill CC") || message.equalsIgnoreCase("p!pSkill Concentration")) {
            event.getTextChannel().sendMessage((Constants.pskillCC)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill CE") || message.equalsIgnoreCase("p!pSkill Controlled Enhance")) {
            event.getTextChannel().sendMessage((Constants.pskillCE)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill CA") || message.equalsIgnoreCase("p!pSkill Counter Attack")) {
            event.getTextChannel().sendMessage((Constants.pskillCA)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill CU") || message.equalsIgnoreCase("p!pSkill Cure")) {
            event.getTextChannel().sendMessage((Constants.pskillCU)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill DS") || message.equalsIgnoreCase("p!pSkill Damage Share")) {
            event.getTextChannel().sendMessage((Constants.pskillDS)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill ED") || message.equalsIgnoreCase("p!pSkill Element Delay")) {
            event.getTextChannel().sendMessage((Constants.pskillED)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill AT") || message.equalsIgnoreCase("p!pSkill Attack Terminator")) {
            event.getTextChannel().sendMessage((Constants.pskillAT)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill FA") || message.equalsIgnoreCase("p!pSkill Fanatic")) {
            event.getTextChannel().sendMessage((Constants.pskillFA)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill FI") || message.equalsIgnoreCase("p!pSkill Firmness")) {
            event.getTextChannel().sendMessage((Constants.pskillFI)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill FU") || message.equalsIgnoreCase("p!pSkill Follow Up")) {
            event.getTextChannel().sendMessage((Constants.pskillFU)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill FD") || message.equalsIgnoreCase("p!pSkill Frost Diver")) {
            event.getTextChannel().sendMessage((Constants.pskillFD)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GAS") || message.equalsIgnoreCase("p!pSkill Group Assassination")) {
            event.getTextChannel().sendMessage((Constants.pskillGAS)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GAW") || message.equalsIgnoreCase("p!pSkill Group Awaken")) {
            event.getTextChannel().sendMessage((Constants.pskillGAW)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GC") || message.equalsIgnoreCase("p!pSkill Group Counter")) {
            event.getTextChannel().sendMessage((Constants.pskillGC)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GF") || message.equalsIgnoreCase("p!pSkill Group Freeze")) {
            event.getTextChannel().sendMessage((Constants.pskillGF)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GR") || message.equalsIgnoreCase("p!pSkill Group Restore")) {
            event.getTextChannel().sendMessage((Constants.pskillGR)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GSL") || message.equalsIgnoreCase("p!pSkill Group Sleep")) {
            event.getTextChannel().sendMessage((Constants.pskillGSL)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GSO") || message.equalsIgnoreCase("p!pSkill Group Stone")) {
            event.getTextChannel().sendMessage((Constants.pskillGSO)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GSR") || message.equalsIgnoreCase("p!pSkill Group Strengthen")) {
            event.getTextChannel().sendMessage((Constants.pskillGSR)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill GSU") || message.equalsIgnoreCase("p!pSkill Group Stun")) {
            event.getTextChannel().sendMessage((Constants.pskillGSU)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill LS") || message.equalsIgnoreCase("p!pSkill Life Stealer")) {
            event.getTextChannel().sendMessage((Constants.pskillLS)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill LT") || message.equalsIgnoreCase("p!pSkill Life Transfer")) {
            event.getTextChannel().sendMessage((Constants.pskillLT)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill MB") || message.equalsIgnoreCase("p!pSkill Magic Burn")) {
            event.getTextChannel().sendMessage((Constants.pskillMB)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill MR") || message.equalsIgnoreCase("p!pSkill Marker")) {
            event.getTextChannel().sendMessage((Constants.pskillMR)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill MA") || message.equalsIgnoreCase("p!pSkill DA") || message.equalsIgnoreCase("p!pSkill Multiple Attack")) {
            event.getTextChannel().sendMessage((Constants.pskillMA)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill PR") || message.equalsIgnoreCase("p!pSkill Protection")) {
            event.getTextChannel().sendMessage((Constants.pskillPR)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill QS") || message.equalsIgnoreCase("p!pSkill Quick Spell")) {
            event.getTextChannel().sendMessage((Constants.pskillQS)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill RA") || message.equalsIgnoreCase("p!pSkill Raid Away")) {
            event.getTextChannel().sendMessage((Constants.pskillRA)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill RE") || message.equalsIgnoreCase("p!pSkill Restore")) {
            event.getTextChannel().sendMessage((Constants.pskillRE)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill ST") || message.equalsIgnoreCase("p!pSkill Shield of Tardy")) {
            event.getTextChannel().sendMessage((Constants.pskillST)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill SL") || message.equalsIgnoreCase("p!pSkill Sleep")) {
            event.getTextChannel().sendMessage((Constants.pskillSL)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill SA") || message.equalsIgnoreCase("p!pSkill Sleep Attack")) {
            event.getTextChannel().sendMessage((Constants.pskillSA)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill SN") || message.equalsIgnoreCase("p!pSkill Sneer")) {
            event.getTextChannel().sendMessage((Constants.pskillSN)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill SD") || message.equalsIgnoreCase("p!pSkill Soul Destroyer")) {
            event.getTextChannel().sendMessage((Constants.pskillSD)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill SCO") || message.equalsIgnoreCase("p!pSkill Spirit Counter")) {
            event.getTextChannel().sendMessage((Constants.pskillSCO)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill SCU") || message.equalsIgnoreCase("p!pSkill Stone Curse")) {
            event.getTextChannel().sendMessage((Constants.pskillSCU)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill SR") || message.equalsIgnoreCase("p!pSkill Strengthen")) {
            event.getTextChannel().sendMessage((Constants.pskillSR)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill SW") || message.equalsIgnoreCase("p!pSkill Swift")) {
            event.getTextChannel().sendMessage((Constants.pskillSW)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill TH") || message.equalsIgnoreCase("p!pSkill Thump")) {
            event.getTextChannel().sendMessage((Constants.pskillTH)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill UN") || message.equalsIgnoreCase("p!pSkill Unyield")) {
            event.getTextChannel().sendMessage((Constants.pskillUN)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        } else if (message.equalsIgnoreCase("p!pSkill WT") || message.equalsIgnoreCase("p!pSkill Weak Track")) {
            event.getTextChannel().sendMessage((Constants.pskillWT)).queue((message2 -> message2.delete().queueAfter(240, TimeUnit.SECONDS)));
            counter++;
        }
        return counter;
    }
}

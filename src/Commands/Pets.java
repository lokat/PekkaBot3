package Commands;
import net.dv8tion.jda.core.EmbedBuilder;
//import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.MessageChannel;
import java.util.concurrent.TimeUnit;

import java.awt.Color;

class Pets {
    public static void Osiris(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Osiris");
        builder.setDescription("Explore: Increase CRIT DMG by 10%\nR4: Deal 2.5% of Enemies HP as DMG every 5s");
        builder.setColor(Color.ORANGE);
        //builder.setFooter("Osiris", "http://i.imgur.com/vB3UI4I.png");
        builder.setThumbnail("http://i.imgur.com/vB3UI4I.png");
        builder.setAuthor("Osiris", "https://discordapp.com", "http://i.imgur.com/vB3UI4I.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Lv 1 Stat", "```HP : 2475   SP  : 295\n" +
                "ATK: 216    MATK: 288\n" +
                "DEF: 150    MDEF: 150\n" +
                "HIT: 66     EVA : 66\n" +
                "CRT: 85     ASD : 85\n" +
                "TEN: 66     CST : 66```", false);
        builder.addField("Pet Unlocks","```C100: Unyield II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Maya(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Maya");
        builder.setDescription("Explore: Increase CRIT DMG by 10%\nR4: Battlecry - Pet ATK and DEF raised by 8%");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/BuWUBUi.png");
        builder.setAuthor("Maya", "https://discordapp.com", "https://i.imgur.com/BuWUBUi.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Lv 1 Stat", "```HP : 3217   SP  : 385\n" +
                "ATK: 192    MATK: 211\n" +
                "DEF: 195    MDEF: 195\n" +
                "HIT: 66     EVA : 85\n" +
                "CRT: 66     ASD : 66\n" +
                "TEN: 66     CST : 99```", false);
        builder.addField("Pet Unlocks","```C100: Shield of Tardy II\nC120: Spirit Counter III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Baphomet(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Baphomet");
        builder.setDescription("Explore: Increase Skill DMG by 12.5%\nR4: Each Crit will reduce DEF/MDEF by 10% up to 60%");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/icfHcBJ.png");
        builder.setAuthor("Baphomet", "https://discordapp.com", "https://i.imgur.com/icfHcBJ.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "EVA", true);
        builder.addField("Lv 1 Stat", "```HP : 2475   SP  : 295\n" +
                "ATK: 288    MATK: 288\n" +
                "DEF: 150    MDEF: 150\n" +
                "HIT: 66     EVA : 66\n" +
                "CRT: 85     ASD : 93\n" +
                "TEN: 66     CST : 66```", false);
        builder.addField("Pet Unlocks","```C80: Bloodshot II\nC100: Attack Terminator II\nC150: Attack Terminator IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Mistress(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Mistress");
        builder.setDescription("Explore: 15% less DMG Taken\nR4: Deathword - Revive but DMG decreassed by 90% SP increased by 100%");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/WvRDte5.png");
        builder.setAuthor("Mistress", "https://discordapp.com", "https://i.imgur.com/WvRDte5.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "ASD", true);
        builder.addField("Lv 1 Stat", "```HP : 3217   SP  : 422\n" +
                "ATK: 249    MATK: 249\n" +
                "DEF: 150    MDEF: 150\n" +
                "HIT: 66     EVA : 66\n" +
                "CRT: 66     ASD : 66\n" +
                "TEN: 99     CST : 85```", false);
        builder.addField("Pet Unlocks","```C120: Shield of Tardy III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void BaphoJr(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Baphomet Jr.");
        builder.setDescription("Explore: Chance to get Enhance Metal\nR4: 75% chance to dodge debuff");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/IabrMbg.png");
        builder.setAuthor("Baphomet Jr.", "https://discordapp.com", "https://i.imgur.com/IabrMbg.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "CRT", true);
        builder.addField("Lv 1 Stat", "```HP : 3217   SP  : 295\n" +
                "ATK: 249    MATK: 249\n" +
                "DEF: 195    MDEF: 195\n" +
                "HIT: 66     EVA : 66\n" +
                "CRT: 85     ASD : 93\n" +
                "TEN: 66     CST : 66```", false);
        builder.addField("Pet Unlocks","```C35: Attack Terminator I\nC150: Attack Terminator IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void GTB(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Golden Thief Bug");
        builder.setDescription("Explore: 15% more gold\nR4: 33% chance to do 2-4 attacks");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/Kpitoe8.png");
        builder.setAuthor("Golden Thief Bug", "https://discordapp.com", "https://i.imgur.com/Kpitoe8.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "MDEF", true);
        builder.addField("Lv 1 Stat", "```HP : 3712   SP  : 295\n" +
                "ATK: 192    MATK: 192\n" +
                "DEF: 225    MDEF: 247\n" +
                "HIT: 66     EVA : 85\n" +
                "CRT: 66     ASD : 66\n" +
                "TEN: 66     CST : 66```", false);
        builder.addField("Pet Unlocks","```C50: Bloodshot I```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Drake(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Drake");
        builder.setDescription("Explore: 2s less between battles\nR4: Deathword - Allied damage is increased by 10% and damage received is decreased by 10% for 6 seconds");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/Qr1y3Wc.png");
        builder.setAuthor("Drake", "https://discordapp.com", "https://i.imgur.com/Qr1y3Wc.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "DEF", true);
        builder.addField("Lv 1 Stat", "```HP : 3712   SP  : 295\n" +
                "ATK: 192    MATK: 192\n" +
                "DEF: 247    MDEF: 225\n" +
                "HIT: 66     EVA : 85\n" +
                "CRT: 66     ASD : 66\n" +
                "TEN: 66     CST : 66```", false);
        builder.addField("Pet Unlocks","```C100: Quick Spell II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Eddga(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Eddga");
        builder.setDescription("Explore: 33% chance to do 30% more DMGs\nR4: Pet will only take full DMG every 6s");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/kmH7Sai.png");
        builder.setAuthor("Eddga", "https://discordapp.com", "https://i.imgur.com/kmH7Sai.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Lv 1 Stat", "```HP : 4083   SP  : 295\n" +
                "ATK: 192    MATK: 192\n" +
                "DEF: 225    MDEF: 225\n" +
                "HIT: 66     EVA : 85\n" +
                "CRT: 66     ASD : 66\n" +
                "TEN: 66     CST : 66```", false);
        builder.addField("Pet Unlocks","``` ```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Moonlight(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Moonlight Flower");
        builder.setDescription("Explore: 12.5 more skill EVA\nR4: Skills do 15% more DMG");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/xuFIv5a.png");
        builder.setAuthor("Moonlight Flower", "https://discordapp.com", "https://i.imgur.com/xuFIv5a.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Lv 1 Stat", "```HP : 2788   SP  : 256\n" +
                "ATK: 215    MATK: 215\n" +
                "DEF: 168    MDEF: 168\n" +
                "HIT: 74     EVA : 57\n" +
                "CRT: 57     ASD : 57\n" +
                "TEN: 57     CST : 62```", false);
        builder.addField("Pet Unlocks","``` ```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Dracula(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Dracula");
        builder.setDescription("Explore: Every 20% HP lost damages enemies for 2.5% current HP\nR4: Every 8s steal 3% of a random Enemie's MAX HP");
        builder.setColor(Color.ORANGE);
        builder.setThumbnail("https://i.imgur.com/jyQQU7s.png");
        builder.setAuthor("Dracula", "https://discordapp.com", "https://i.imgur.com/jyQQU7s.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Lv 1 Stat", "```HP : 3217   SP  : 385\n" +
                "ATK: 249    MATK: 249\n" +
                "DEF: 150    MDEF: 150\n" +
                "HIT: 66     EVA : 66\n" +
                "CRT: 66     ASD : 66\n" +
                "TEN: 99     CST : 93```", false);
        builder.addField("Pet Unlocks","``` ```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Deniro(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Deniro");
        builder.setDescription("Explore: Increase DMG by 10%\nR4: If hit by a CRT, next skill will CRT");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/ewIe27O.png");
        builder.setAuthor("Deniro", "https://discordapp.com", "https://i.imgur.com/ewIe27O.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E100: Asthayi III\n" +
                "      Ciernie III\nC80: Attack Strengthen II\nC120: Counter Attack III\nC150: Unyield IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void HighOrc(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("High Orc");
        builder.setDescription("Explore: Increase DEF by 50% when debuffed\nR4: Cause an ally to reflect 25% DMG");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/ZVnivfx.png");
        builder.setAuthor("High Orc", "https://discordapp.com", "https://i.imgur.com/ZVnivfx.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E100: Flamma III\nC60: Attack Terminator I\nC120: Group Counter III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Minorous(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Minorous");
        builder.setDescription("Explore: Every 20% HP lost lowers damage taken by 2%\nR4: This pet has hit rate increase of 50%, each hit makes the target's hit rate decrease by 2%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/2baUXYP.png");
        builder.setAuthor("Minorous", "https://discordapp.com", "https://i.imgur.com/2baUXYP.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void PecoPeco(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Peco Peco");
        builder.setDescription("Explore: Attacks ignore 6% of enemy DEF\nR4: Will target the same enemy");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/T62h0nb.png");
        builder.setAuthor("Peco Peco", "https://discordapp.com", "https://i.imgur.com/T62h0nb.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void WarriorOrc(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Warrior Orc");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/FX6tGaT.png");
        builder.setAuthor("Warrior Orc", "https://discordapp.com", "https://i.imgur.com/FX6tGaT.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E80: Aries II\nC50: Group Awaken 1\nC60: Attack Terminator I\nC100: Attack Strengthen III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void PirateSkeleton(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Pirate Skeleton");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/aDBwE9w.png");
        builder.setAuthor("Pirate Skeleton", "https://discordapp.com", "https://i.imgur.com/aDBwE9w.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E80: Desita II\nC50: Grop Strengthen I\nC150: Fanatic IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Hornet(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Hornet");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/gixqwpI.png");
        builder.setAuthor("Hornet", "https://discordapp.com", "https://i.imgur.com/gixqwpI.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E40: Ciernie I\nE80: Asthayi II\nC50: Group Stone I\n" +
                "C100: Damage Share III\n" +
                "      Spirit Counter II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Wolf(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Wolf");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/sWwChmV.png");
        builder.setAuthor("Wolf", "https://discordapp.com", "https://i.imgur.com/sWwChmV.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Rocker(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Rocker");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/SklG46W.png");
        builder.setAuthor("Rocker", "https://discordapp.com", "https://i.imgur.com/SklG46W.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E80: Desita II\nC80: Weak Track II\nC100: Group Stun II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Andre(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Andre");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/i1rRDDk.png");
        builder.setAuthor("Andre", "https://discordapp.com", "https://i.imgur.com/i1rRDDk.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E40: Era I\n" +
                "     Ciernie I\n" +
                "C80: Damage Share II\n" +
                "C100: Group Strengthen II\n" +
                "      Follow-up III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void EvilSkeleton(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Evil Skeleton");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/1fQ4SxK.png");
        builder.setAuthor("Evil Skeleton", "https://discordapp.com", "https://i.imgur.com/1fQ4SxK.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E40: Aries I\nC30: Unyield I\n" +
                "C100: Attack Strengthen III\n" +
                "      Cure II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Jakk(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Jakk");
        builder.setDescription("Explore: Increase MDMG by 10%\nR4: Deathword - Deal 15% of enemies max HP as DMG/MDMG");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/Ldnd8BM.png");
        builder.setAuthor("Jakk", "https://discordapp.com", "https://i.imgur.com/Ldnd8BM.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```E100: Kuura III\nC100: Bloodshot II\nC110: Attack Terminator II\nC120: Group Stun III\nC150: Unyield IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Anubis(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Anubis");
        builder.setDescription("Explore: 5% more DMG/MDMG to debuffed enemies\nR4: Follower - Will use skills twice, 34s between skills");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/6VJBw3I.png");
        builder.setAuthor("Anubis", "https://discordapp.com", "https://i.imgur.com/6VJBw3I.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Sohee(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Sohee");
        builder.setDescription("Explore: Increase healing by 15%\nR4: 3s after a skill increase hit rate by 100%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/JprJIvY.png");
        builder.setAuthor("Sohee", "https://discordapp.com", "https://i.imgur.com/JprJIvY.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void GoblinO(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Goblin :O");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/J7LdF7z.png");
        builder.setAuthor("Goblin :O", "https://discordapp.com", "https://i.imgur.com/J7LdF7z.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "ATK", true);
        builder.addField("Pet Unlocks","```E40: Flamma 1\nC80: Follow-up II\n" +
                "C100: Group Freeze II\n" +
                "      Unyield III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Creamy(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Creamy");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/lS7FeZq.png");
        builder.setAuthor("Creamy", "https://discordapp.com", "https://i.imgur.com/lS7FeZq.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```E40: Kuura I\nC30: Quick Spell I\nC50: Group Restore I\nC100: Protection III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Viata(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Vitata");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/bMiADQs.png");
        builder.setAuthor("Vitata", "https://discordapp.com", "https://i.imgur.com/bMiADQs.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```E40: Desita I\nC50: Marker I\nC80: Damage Share II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Bongun(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Bon Gun");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/Ds5CD0F.png");
        builder.setAuthor("Bon Gun", "https://discordapp.com", "https://i.imgur.com/Ds5CD0F.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```E80: Kuura II\nC30: Quick Spell I\nC50: Group Counter I\nC100: Concentration III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void TharaFrog(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Thara Frog");
        builder.setDescription("Explore: Increase MATK by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/9CrShrr.png");
        builder.setAuthor("Thara Frog", "https://discordapp.com", "https://i.imgur.com/9CrShrr.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```E80: Iawanan II\nC50: Stone Curse I\nC80: Protection II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Marduk(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Marduk");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/GilEPS5.png");
        builder.setAuthor("Marduk", "https://discordapp.com", "https://i.imgur.com/GilEPS5.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Hydra(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Hydra");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/t0e1rwE.png");
        builder.setAuthor("Hydra", "https://discordapp.com", "https://i.imgur.com/t0e1rwE.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```E40: Vald I\nE80: Ciernie II\n" +
                "C100: Life Stealer III\n" +
                "      Group Awaken II\n" +
                "      Quick Spell III\n" +
                "      Concentration III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Spore(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Spore");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/FRWptDO.png");
        builder.setAuthor("Spore", "https://discordapp.com", "https://i.imgur.com/FRWptDO.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```E80: Adamzat II\n" +
                "     Kuura II\nC80: Life Transfer II\nC100:S Stone Curse II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Marc(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Marc");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/hDCIkkI.png");
        builder.setAuthor("Marc", "https://discordapp.com", "https://i.imgur.com/hDCIkkI.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "MATK", true);
        builder.addField("Pet Unlocks","```E40: Celeritas I\nC100: Swift II\nC150: Concentration IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void RotarZairo(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Rotar Zairo");
        builder.setDescription("Explore: Reduce DMG/MDMG taken by 7.5%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/WN73Eiz.png");
        builder.setAuthor("Rotar Zairo", "https://discordapp.com", "https://i.imgur.com/WN73Eiz.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "ASD", true);
        builder.addField("Pet Unlocks","```E100: Iawanan III\nC100: Swift III\nC120: Group Stone III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void OrcArcher(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Orc Archer");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/pBy7i9i.png");
        builder.setAuthor("Orc Archer", "https://discordapp.com", "https://i.imgur.com/pBy7i9i.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "ASD", true);
        builder.addField("Pet Unlocks","```E80: Opari II\nC50: Attack Strengthen I\nC100: Fanatic III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void ArcherSkeleton(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Archer Skeleton");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/BfRX8oU.png");
        builder.setAuthor("Archer Skeleton", "https://discordapp.com", "https://i.imgur.com/BfRX8oU.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "ASD", true);
        builder.addField("Pet Unlocks","```E40: Asthayi I\n" +
                "     Opari I\nC30: Unyield I\nC50: Cure I\nC150: Fanatic IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Matyr(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Matyr");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/vc9y1q5.png");
        builder.setAuthor("Matyr", "https://discordapp.com", "https://i.imgur.com/vc9y1q5.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "ASD", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void KingGoblin(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("King Goblin");
        builder.setDescription("Explore: Increase DMG by 10%\nR4: Decrease CST time by 3% every 5s");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/5AwshkC.png");
        builder.setAuthor("King Goblin", "https://discordapp.com", "https://i.imgur.com/5AwshkC.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "CST", true);
        builder.addField("Pet Unlocks","```E100: Aries III\nC120: Stone Curse III\nC150: Follow-up IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Griffon(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Griffon");
        builder.setDescription("Explore: EVA an attack increases DMG/MDMG by 1.5 Stacks%\nR4: Battlecry - Decrease enemy ATK/DEF by 5%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/7H9dX9I.png");
        builder.setAuthor("Griffon", "https://discordapp.com", "https://i.imgur.com/7H9dX9I.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "CST", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Phen(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Phen");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/e4mvi4s.png");
        builder.setAuthor("Phen", "https://discordapp.com", "https://i.imgur.com/e4mvi4s.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "CST", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Anolian(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Anolian");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/NFZf4Lx.png");
        builder.setAuthor("Anolian", "https://discordapp.com", "https://i.imgur.com/NFZf4Lx.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "CST", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Smokie(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Smokie");
        builder.setDescription("Explore: 15% less SP used\nR4: Battlecry - Randomly reduces the max hp of one of the enemy by 10%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/OmshYJ3.png");
        builder.setAuthor("Smokie", "https://discordapp.com", "https://i.imgur.com/OmshYJ3.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "CST", true);
        builder.addField("Pet Unlocks","```E100: Adamzat III\n" +
                "      Taika III\n" +
                "C120: Group Feeze III\nC150: Weak Track IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void VagabondWolf(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Vagabond Wolf");
        builder.setDescription("Explore: Debuffs on enemies last 20%\nR4: Battlecry - Copy the ability of a random pet");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/xw2PItL.png");
        builder.setAuthor("Vagabond Wolf", "https://discordapp.com", "https://i.imgur.com/xw2PItL.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "CRT", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Deviruchi(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Deviruchi");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/IhEJzuW.png");
        builder.setAuthor("Deviruchi", "https://discordapp.com", "https://i.imgur.com/IhEJzuW.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "CRT", true);
        builder.addField("Pet Unlocks","```E80: Taika II\nC30: Shield of Tardy I\nC50: Sleep I\nC100: Life Stealer III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void GoblinArcher(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Goblin Archer");
        builder.setDescription("Explore: Decrease DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/MjXQdPu.png");
        builder.setAuthor("Goblin Archer", "https://discordapp.com", "https://i.imgur.com/MjXQdPu.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "CRT", true);
        builder.addField("Pet Unlocks","```E40: Vald I\n" +
                "     Opari I\nC50: Follow-up I```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Farmiliar(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Farmiliar");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/2r6NhvW.png");
        builder.setAuthor("Farmiliar", "https://discordapp.com", "https://i.imgur.com/2r6NhvW.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "CRT", true);
        builder.addField("Pet Unlocks","```E80: Fluo II\nC50: Group Stun I\nC80: Life Stealer II\nC100: Life Transfer III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Magnolia(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Magnolia");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/IGNaiLc.png");
        builder.setAuthor("Magnolia", "https://discordapp.com", "https://i.imgur.com/IGNaiLc.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "CRT", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void GoblinD(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Goblin :D");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/on9kout.png");
        builder.setAuthor("Goblin :D", "https://discordapp.com", "https://i.imgur.com/on9kout.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "CRT", true);
        builder.addField("Pet Unlocks","```E80: Flamma II\nC80: Follow-up II\n" +
                "C100: Group Sleep II\n" +
                "      Unyield III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void SteamGoblin(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Steam Goblin");
        builder.setDescription("Explore: 40% chance for more gear\nR4: Deathword - Cause a negative effect to all enemies");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/Rv8XbH9.png");
        builder.setAuthor("Steam Goblin", "https://discordapp.com", "https://i.imgur.com/Rv8XbH9.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E100: Opari III\nC100: Swift III\nC110: Shield of Tardy II\nC120: Soul Destroyer III\nC150: Follow-up IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Khalitzburg(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Khalitzburg");
        builder.setDescription("Explore: Damage converted to 5% reduced DMG\nR4: DMG dealt to debuffed pets increased by 15%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/UjWk4PK.png");
        builder.setAuthor("Khalitzburg", "https://discordapp.com", "https://i.imgur.com/UjWk4PK.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void NineTail(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Nine Tail");
        builder.setDescription("Explore: 5% increased DMG to debuffed enemies\nR4: Battlecry - Randomly decrease a enemy stats by 8%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/9OaDLrt.png");
        builder.setAuthor("Nine Tail", "https://discordapp.com", "https://i.imgur.com/9OaDLrt.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void ElderWillow(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Elder Willow");
        builder.setDescription("Explore: 15% increased DMG to pets\nR4: Follower - Decrease CST by 90%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/EwyXuIE.png");
        builder.setAuthor("Elder Willow", "https://discordapp.com", "https://i.imgur.com/EwyXuIE.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4``",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Eclipse(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Eclipse");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/SqzOiep.png");
        builder.setAuthor("Eclipse", "https://discordapp.com", "https://i.imgur.com/SqzOiep.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E80: Enkeli II\nC50: Group Sleep I\nC80: Life Transfer II\n" +
                "C100: Weak Track III\n" +
                "      Restore III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Bigfoot(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Bigfoot");
        builder.setDescription("Explore: Decrease DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/Es1mtlW.png");
        builder.setAuthor("Bigfoot", "https://discordapp.com", "https://i.imgur.com/Es1mtlW.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E80: Taika II\nC50: Group Freeze I\nC100: Sneer III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Poporing(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Poporing");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/AAALatZ.png");
        builder.setAuthor("Poporing", "https://discordapp.com", "https://i.imgur.com/AAALatZ.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E40: Fluo I\nC50: Fanatic I\n" +
                "C100: Damage Share III\n" +
                "      Cure III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Argiope(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Argiope");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/GRmM2NR.png");
        builder.setAuthor("Argiope", "https://discordapp.com", "https://i.imgur.com/GRmM2NR.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E80: Era II\n" +
                "     Ciernie II\nC50: Soul Destroyer I\nC100: Group Strengthen III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Gierth(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Gierth");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/a4ObEjd.png");
        builder.setAuthor("Gierth", "https://discordapp.com", "https://i.imgur.com/a4ObEjd.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Mandragora(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Mandragora");
        builder.setDescription("Explore: Decrease DMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/4l4x4IB.png");
        builder.setAuthor("Mandragora", "https://discordapp.com", "https://i.imgur.com/4l4x4IB.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E40: Adamzat I\n" +
                "     Kuura I\n" +
                "C100: Group Restore II\n" +
                "      Life Transfer III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Tarou(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Tarou");
        builder.setDescription("Explore: Decrease MDMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/jz4SYTa.png");
        builder.setAuthor("Tarou", "https://discordapp.com", "https://i.imgur.com/jz4SYTa.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E80: Enkeli II\nC100: Frost Diver II\nC120: Marker III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Munak(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Munak");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/q2PdrJo.png");
        builder.setAuthor("Munak", "https://discordapp.com", "https://i.imgur.com/q2PdrJo.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E80: Fluo II\nC80: Life Stealer II\nC100: Concentration II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Vadon(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Vadon");
        builder.setDescription("Explore: Decrease DMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/2aAuFhW.png");
        builder.setAuthor("Vadon", "https://discordapp.com", "https://i.imgur.com/2aAuFhW.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E40: Taika I\nC80: Protection II\nC100: Group Stone II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void GoblinS(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Goblin :(");
        builder.setDescription("Explore: Decrease DMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/nhF92ZM.png");
        builder.setAuthor("Goblin :(", "https://discordapp.com", "https://i.imgur.com/nhF92ZM.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "DEF/MDEF", true);
        builder.addField("Pet Unlocks","```E80: Flamma II\n" +
                "     Era II\n" +
                "C100: Fanatic II\n" +
                "      Follow-up III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Angeling(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Angeling");
        builder.setDescription("Explore: Restores 1.5% HP on each attack\nR4: Deathword - Heal every ally by 20% of their MAX HP");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/RdnpQce.png");
        builder.setAuthor("Angeling", "https://discordapp.com", "https://i.imgur.com/RdnpQce.png");
        builder.addField("Race", "Angel", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```E100: Fluo III\nC80: Bloodshot I\nC120: Frost Diver III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void KingPoring(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("King Poring");
        builder.setDescription("Explore: Boss Battle Time Limit Increased By 20%\nR4: Every 5s heal team for 2% of their MAX HP");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/Ody3czD.png");
        builder.setAuthor("King Poring", "https://discordapp.com", "https://i.imgur.com/Ody3czD.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","``` ```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void DevilMaid(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Devil Maid");
        builder.setDescription("Explore: Damage taken converted to physical, 5% damage reduction\nR4: Every time you are hit by an auto attack, increase ATK SPD by 5%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/AOffWC7.png");
        builder.setAuthor("Devil Maid", "https://discordapp.com", "https://i.imgur.com/AOffWC7.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void SantaPoring(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Santa Poring");
        builder.setDescription("Explore: Crit chance increases 30% every 6 seconds, but resets on crit\nR4: Every 10s, randomly increase an attribute for 5s");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/h6PjtgR.png");
        builder.setAuthor("Santa Poring", "https://discordapp.com", "https://i.imgur.com/h6PjtgR.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```Unlocked Special Event```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Savage(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Savage");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/wGqUFRQ.png");
        builder.setAuthor("Savage", "https://discordapp.com", "https://i.imgur.com/wGqUFRQ.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```E40: Taika I\nC50: Strengthen I\nC80: Sneer II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Muka(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Muka");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/cjhZNop.png");
        builder.setAuthor("Muka", "https://discordapp.com", "https://i.imgur.com/cjhZNop.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```E40: Adamzat I\nE80: Aries II\nC50: Awaken I\nC150: Concentration IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Drainliar(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Drainliar");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/fU4CT0m.png");
        builder.setAuthor("Drainliar", "https://discordapp.com", "https://i.imgur.com/fU4CT0m.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```E80: Asthayi II\n     Celeritas II\nC50: Frost Diver I\nC150: Weak Track IV```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Golem(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Golem");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/qbIlzeD.png");
        builder.setAuthor("Golem", "https://discordapp.com", "https://i.imgur.com/qbIlzeD.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void DesertWolf(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Desert Wolf");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/zITDBWo.png");
        builder.setAuthor("Desert Wolf", "https://discordapp.com", "https://i.imgur.com/zITDBWo.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Marina(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Marina");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/86XKY5j.png");
        builder.setAuthor("Marina", "https://discordapp.com", "https://i.imgur.com/86XKY5j.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Poring(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Poring");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/NZ5kWVh.png");
        builder.setAuthor("Poring", "https://discordapp.com", "https://i.imgur.com/NZ5kWVh.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```E40: Fluo I\nC80: Sneer II\nC100: Cure III\n      Restore II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void GoblinA(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Goblin -_-");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/gZB4DAX.png");
        builder.setAuthor("Goblin -_-", "https://discordapp.com", "https://i.imgur.com/gZB4DAX.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```E40: Flamma I\nC100: Counter Attack II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Fabre(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Fabre");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.WHITE);
        builder.setThumbnail("https://i.imgur.com/IM7Y1tV.png");
        builder.setAuthor("Fabre", "https://discordapp.com", "https://i.imgur.com/IM7Y1tV.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "HP", true);
        builder.addField("Pet Unlocks","```E40: Enkeli I\n     Era I\nC100: Weak Track III\n      Soul Destroyer II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }

    public static void Incubus(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Incubus");
        builder.setDescription("Explore: Damage taken converted to magical, 5% damage reduction\nR4: Every time you get hit, increase skill cast speed by 10%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/rqCaXxF.png");
        builder.setAuthor("Incubus", "https://discordapp.com", "https://i.imgur.com/rqCaXxF.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "SP", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Eggyra(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Eggyra");
        builder.setDescription("Explore: Reduce MDMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/9auuyVz.png");
        builder.setAuthor("Eggyra", "https://discordapp.com", "https://i.imgur.com/9auuyVz.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "SP", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Willow(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Willow");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/ta5TAY7.png");
        builder.setAuthor("Willow", "https://discordapp.com", "https://i.imgur.com/ta5TAY7.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "SP", true);
        builder.addField("Pet Unlocks","```E40: Iawanan I\nC100: Group Counter II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Lunatic(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Lunatic");
        builder.setDescription("Explore: Reduce MDMG taken by 5%");
        builder.setColor(Color.WHITE);
        builder.setThumbnail("https://i.imgur.com/Dhd1iyz.png");
        builder.setAuthor("Lunatic", "https://discordapp.com", "https://i.imgur.com/Dhd1iyz.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "SP", true);
        builder.addField("Pet Unlocks","```E40: Enkeli I\nC100: Strengthen II\n      Restore III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Piere(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Piere");
        builder.setDescription("Explore: Reduce MDMG taken by 5%");
        builder.setColor(Color.WHITE);
        builder.setThumbnail("https://i.imgur.com/gQ6svWU.png");
        builder.setAuthor("Piere", "https://discordapp.com", "https://i.imgur.com/gQ6svWU.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "SP", true);
        builder.addField("Pet Unlocks","```E40: Iawanan I\nC80: Attack Strengthen II\nC100: Sleep II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }

    public static void Deviling(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Deviling");
        builder.setDescription("Explore: Debuffs on you last 1s shorter\nR4:  After being hit by a crit, reduce CRIT DMG taken by 5%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/DvnDJlr.png");
        builder.setAuthor("Deviling", "https://discordapp.com", "https://i.imgur.com/DvnDJlr.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "Accuracy", true);
        builder.addField("Pet Unlocks","```E100: Enkeli III\n      Vald III\nC30: Shield of Tardy I\nC100: Firmness II/III\nC110: Quick Spell II\nC120: Sleep III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Ghostring(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Ghostring");
        builder.setDescription("Explore: Avoids an attack every 8 seconds\nR4:  Every disable reduces the duration of disables for this pet by 20%");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/DKladl1.png");
        builder.setAuthor("Ghostring", "https://discordapp.com", "https://i.imgur.com/DKladl1.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "Accuracy", true);
        builder.addField("Pet Unlocks","```E100: Celeritas III\nC30: Spirit Counter I\nC100: Firmness II/III\nC110: Spirit Counter II\nC120: Strenghten III\nC130: Shield of Tardy III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Drops(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Drops");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/svVFhFk.png");
        builder.setAuthor("Drops", "https://discordapp.com", "https://i.imgur.com/svVFhFk.png");
        builder.addField("Race", "Plant", true);
        builder.addField("Explore Stat", "Accuracy", true);
        builder.addField("Pet Unlocks","```E80: Iawanan II\n     Vald II\nC50: Restore I\nC100: Group Strengthen III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Gargoyle(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Gargoyle");
        builder.setDescription("Explore: Reduce MDMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/gok3oOX.png");
        builder.setAuthor("Gargoyle", "https://discordapp.com", "https://i.imgur.com/gok3oOX.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "Accuracy", true);
        builder.addField("Pet Unlocks","```E80: Opari II\n     Vald II\nC50: Concentration I\nC100: Fanatic III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Mummy(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Mummy");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/H6UwnPy.png");
        builder.setAuthor("Mummy", "https://discordapp.com", "https://i.imgur.com/H6UwnPy.png");
        builder.addField("Race", "Undead", true);
        builder.addField("Explore Stat", "Accuracy", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Isis(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Isis");
        builder.setDescription("Explore: Regain 0.5% of damage dealt as SP\nR4:  When an enemy casts a spell, increase their SP consumption by 3% of their max SP.");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/3C9VRlQ.png");
        builder.setAuthor("Isis", "https://discordapp.com", "https://i.imgur.com/3C9VRlQ.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "EVA", true);
        builder.addField("Pet Unlocks","```E100: Desita III\n      Era III\nC110: Unyield II\nC120: Group Sleep III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void DragonFly(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Dragon Fly");
        builder.setDescription("Explore: Every 20% SP spent lowers SP consumption by 25%\nR4:  When attacking enemies weakened by itself, increase DMG by 10%.");
        builder.setColor(Color.MAGENTA);
        builder.setThumbnail("https://i.imgur.com/jsklrHx.png");
        builder.setAuthor("Dragon Fly", "https://discordapp.com", "https://i.imgur.com/jsklrHx.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "EVA", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Yoyo(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Yoyo");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/4fzEBqW.png");
        builder.setAuthor("Yoyo", "https://discordapp.com", "https://i.imgur.com/4fzEBqW.png");
        builder.addField("Race", "Animal", true);
        builder.addField("Explore Stat", "EVA", true);
        builder.addField("Pet Unlocks","```E80: Celeritas II\nC50: Counter Attack I\nC100: Quick Spell III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void OrcBaby(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Orc Baby");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/1wgw704.png");
        builder.setAuthor("Orc Baby", "https://discordapp.com", "https://i.imgur.com/1wgw704.png");
        builder.addField("Race", "Humanoid", true);
        builder.addField("Explore Stat", "EVA", true);
        builder.addField("Pet Unlocks","```E40: Aries I\nE80: Adamzat II\nC30: Firmness I\nC50: Swift I\nC100: Sneer III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Chonchon(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Chonchon");
        builder.setDescription("Explore: Increase DMG by 5%");
        builder.setColor(Color.BLUE);
        builder.setThumbnail("https://i.imgur.com/4lpc6Gw.png");
        builder.setAuthor("Chonchon", "https://discordapp.com", "https://i.imgur.com/4lpc6Gw.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "EVA", true);
        builder.addField("Pet Unlocks","```Unlocked Rebirth 4```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void ThiefBug(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Thief Bug");
        builder.setDescription("Explore: Reduce DMG taken by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/ZktCAg3.png");
        builder.setAuthor("Thief Bug", "https://discordapp.com", "https://i.imgur.com/ZktCAg3.png");
        builder.addField("Race", "Insect", true);
        builder.addField("Explore Stat", "EVA", true);
        builder.addField("Pet Unlocks","```E40: Desita I\nC80: Weak Track II\nC100: Protection III```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Whisper(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Whisper");
        builder.setDescription("Explore: Increase MDMG by 5%");
        builder.setColor(Color.GREEN);
        builder.setThumbnail("https://i.imgur.com/6HdrZWB.png");
        builder.setAuthor("Whisper", "https://discordapp.com", "https://i.imgur.com/6HdrZWB.png");
        builder.addField("Race", "Demon", true);
        builder.addField("Explore Stat", "EVA", true);
        builder.addField("Pet Unlocks","```E40: Asthayi I\n     Celeritas I\nC30: Spirit Counter I\n     Firmness I\nC100: Marker II```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
    public static void Pekka(MessageChannel channel){
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Pekka");
        builder.setDescription("A Dango");
        builder.setColor(Color.PINK);
        builder.setThumbnail("https://i.imgur.com/auDyHRI.gif");
        builder.setAuthor("Pekka", "https://discordapp.com", "http://wppullzone1.epicmatcha.netdna-cdn.com/wp-content/uploads/2016/03/matcha-cookies-hanami-dango.jpg");
        builder.addField("Race", "Dango", true);
        builder.addField("Explore Stat", "LAZ", true);
        builder.addField("Pet Unlocks","```A dango\nA discord bot\nA friend\nA pillow```",false);
        channel.sendMessage(builder.build()).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
    }
}

package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

public class pet {
    public static int callMe(MessageReceivedEvent event, String message, int counter) {
        if (message.equalsIgnoreCase("p!pet")) {
            event.getTextChannel().sendMessage("I dont understand. Please include a pet name.").queue();
        } else if (message.equalsIgnoreCase("p!pet osiris")) {
            Pets.Osiris(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet maya")) {
            Pets.Maya(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet mistress")) {
            Pets.Mistress(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet baphomet jr.") || message.equalsIgnoreCase("p!pet bapho jr")) {
            Pets.BaphoJr(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet baphomet") || message.equalsIgnoreCase("p!pet bapho")) {
            Pets.Baphomet(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet dracula") || message.equalsIgnoreCase("p!pet drac")) {
            Pets.Dracula(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet moonlight flower") || message.equalsIgnoreCase("p!pet moonlight")) {
            Pets.Moonlight(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet eddga")) {
            Pets.Eddga(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet golden thief bug") || message.equalsIgnoreCase("p!pet gtb")) {
            Pets.GTB(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet drake")) {
            Pets.Drake(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet deniro")) {
            Pets.Deniro(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet high orc")) {
            Pets.HighOrc(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet minorous")) {
            Pets.Minorous(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet peco peco")) {
            Pets.PecoPeco(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet warrior orc")) {
            Pets.WarriorOrc(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet pirate skeleton")) {
            Pets.PirateSkeleton(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet hornet")) {
            Pets.Hornet(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet wolf")) {
            Pets.Wolf(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet rocker")) {
            Pets.Rocker(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet andre")) {
            Pets.Andre(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet evil skeleton")) {
            Pets.EvilSkeleton(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet goblin \uD83D\uDE2E")) {
            Pets.GoblinO(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet maya")) {
            Pets.Maya(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet jakk")) {
            Pets.Jakk(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet anubis")) {
            Pets.Anubis(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet sohee")) {
            Pets.Sohee(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet creamy")) {
            Pets.Creamy(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet vitata")) {
            Pets.Viata(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet bon gun")) {
            Pets.Bongun(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet thara frog")) {
            Pets.TharaFrog(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet marduk")) {
            Pets.Marduk(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet hydra")) {
            Pets.Hydra(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet spore")) {
            Pets.Spore(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet marc")) {
            Pets.Marc(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet rotar zairo")) {
            Pets.RotarZairo(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet orc archer")) {
            Pets.OrcArcher(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet archer skeleton")) {
            Pets.ArcherSkeleton(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet matyr")) {
            Pets.Matyr(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet king goblin")) {
            Pets.KingGoblin(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet griffin")) {
            Pets.Griffon(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet phen")) {
            Pets.Phen(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet anolian")) {
            Pets.Anolian(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet smokie")) {
            Pets.Smokie(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet vagabond wolf")) {
            Pets.VagabondWolf(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet deviruchi")) {
            Pets.Deviruchi(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet goblin archer")) {
            Pets.GoblinArcher(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet farmiliar")) {
            Pets.Farmiliar(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet magnolia")) {
            Pets.Magnolia(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet goblin \uD83D\uDE04")) {
            Pets.GoblinD(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet steam goblin")) {
            Pets.SteamGoblin(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet khalitzburg")) {
            Pets.Khalitzburg(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet nine tail")) {
            Pets.NineTail(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet elder willow")) {
            Pets.ElderWillow(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet eclipse")) {
            Pets.Eclipse(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet bigfoot")) {
            Pets.Bigfoot(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet poporing")) {
            Pets.Poporing(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet argiope")) {
            Pets.Argiope(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet gierth")) {
            Pets.Gierth(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet mandragora")) {
            Pets.Mandragora(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet tarou")) {
            Pets.Tarou(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet munak")) {
            Pets.Munak(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet vadon")) {
            Pets.Vadon(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet goblin \uD83D\uDE26")) {
            Pets.GoblinS(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet angeling")) {
            Pets.Angeling(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet king poring")) {
            Pets.KingPoring(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet devil maid")) {
            Pets.DevilMaid(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet santa poring")) {
            Pets.SantaPoring(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet savage")) {
            Pets.Savage(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet muka")) {
            Pets.Muka(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet drainliar")) {
            Pets.Drainliar(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet golem")) {
            Pets.Golem(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet desert wolf")) {
            Pets.DesertWolf(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet marina")) {
            Pets.Marina(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet poring")) {
            Pets.Poring(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet goblin -.-") || message.equalsIgnoreCase("p!pet goblin -_-")) {
            Pets.GoblinA(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet fabre")) {
            Pets.Fabre(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet incubus")) {
            Pets.Incubus(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet eggyra")) {
            Pets.Eggyra(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet willow")) {
            Pets.Willow(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet lunatic")) {
            Pets.Lunatic(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet piere")) {
            Pets.Piere(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet deviling")) {
            Pets.Deviling(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet ghostring")) {
            Pets.Ghostring(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet drops")) {
            Pets.Drops(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet gargoyle")) {
            Pets.Gargoyle(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet mummy")) {
            Pets.Mummy(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet isis")) {
            Pets.Isis(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet dragon fly")) {
            Pets.DragonFly(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet yoyo")) {
            Pets.Yoyo(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet orc baby")) {
            Pets.OrcBaby(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet chonchon")) {
            Pets.Chonchon(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet thief bug")) {
            Pets.ThiefBug(event.getTextChannel());
            counter++;
        } else if (message.equalsIgnoreCase("p!pet whisper")) {
            Pets.Whisper(event.getTextChannel());
            counter++;
        } else if(message.equalsIgnoreCase("p!pet pekka")){
            Pets.Pekka(event.getTextChannel());
        } else if(message.startsWith("p!pet goblin")){
        if(message.equalsIgnoreCase("p!pet goblin")){
            event.getTextChannel().sendMessage(Constants.goblinHelp).queue((message2 -> message2.delete().queueAfter(60, TimeUnit.SECONDS)));
        }else if (message.startsWith("p!pet goblin 1")){
            Pets.GoblinO(event.getTextChannel());
        }else if (message.startsWith("p!pet goblin 2")){
            Pets.GoblinA(event.getTextChannel());
        }else if (message.startsWith("p!pet goblin 3")){
            Pets.GoblinS(event.getTextChannel());
        }else if (message.startsWith("p!pet goblin 4")){
            Pets.GoblinD(event.getTextChannel());
        }
    }
        return counter;
    }
}

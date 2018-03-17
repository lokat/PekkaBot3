import Commands.Constants;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

//import java.awt.Color;

public class Connection {
    public static void main(String[] args) {
        JDA discord = null;
        try {
            discord = new JDABuilder(AccountType.BOT).setToken(Constants.discordToken).buildBlocking();
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RateLimitedException e) {
            e.printStackTrace();
        }
        discord.getPresence().setGame(Game.of(Game.GameType.DEFAULT, "p!help"));
        discord.addEventListener(new MessageRespond());
        System.out.println(discord.getGuilds());
    }
}

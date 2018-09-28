package bot.discord;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;


public class Main {

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken("");

        //Add listener events
        builder.addEventListener(new OnMessageReceivedListener());

        //Finally, build it
        builder.build();
    }
}
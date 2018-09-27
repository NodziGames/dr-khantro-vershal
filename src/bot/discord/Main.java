package bot.discord;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import javax.security.auth.login.LoginException;


public class Main {

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken("NDk0ODEyOTAyODg1NDI1MTUz.Do5UUQ.zckkf3RPIdCxuF8YyS1dtt92A6Q");
        builder.addEventListener(new OnMessageReceivedListener());
        builder.build();
    }
}
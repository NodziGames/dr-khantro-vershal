package bot.discord.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.List;

import static bot.discord.CommandsList.*;

public class Help {

    public static void start(MessageReceivedEvent event, List<String> args) {
        event.getChannel().sendMessage("Below is a list of commands you can use:\n\n"
                + CM_HELP + "\n"
                + CM_DIAGNOSE + "\n"
                + CM_SYMPTOMS + "\n"
                + CM_COUNSEL
        ).queue();
    }
}

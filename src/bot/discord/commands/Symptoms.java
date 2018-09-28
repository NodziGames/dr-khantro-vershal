package bot.discord.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.List;

import static bot.discord.Args.*;
import static bot.discord.CommandsList.*;

public class Symptoms {

    public static void start(MessageReceivedEvent event, List<String> args) {

        event.getChannel().sendMessage("Below is a  list of available symptoms to use in conjunction with " + CM_DIAGNOSE + ":\n\n"
                + SM_ASSPAIN + "\n"
                + SM_CRAMPS + "\n"
                + SM_OUCHKNEES + "\n"
                + SM_THROATHURT
        ).queue();
    }
}

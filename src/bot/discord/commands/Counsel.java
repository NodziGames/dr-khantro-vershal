package bot.discord.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.List;

public class Counsel {

    public static void start(MessageReceivedEvent event, List<String> args) {

        event.getChannel().sendMessage("You've asked me to counsel you. Unfortunately this hasn't been implemented yet.").queue();
    }
}

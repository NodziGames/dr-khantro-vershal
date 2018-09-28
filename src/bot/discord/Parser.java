package bot.discord;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Parser {

    public static void parse(String msg, MessageReceivedEvent event) {

        msg = msg.toLowerCase();

        msg = msg.trim().replaceAll(" +", " ");

        event.getChannel().sendMessage(msg).queue();
    }
}

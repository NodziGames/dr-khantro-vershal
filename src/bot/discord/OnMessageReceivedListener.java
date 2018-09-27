package bot.discord;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import static bot.discord.Commands.*;

public class OnMessageReceivedListener extends ListenerAdapter {

    String msg;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        //Make sure he doesn't talk to other bots
        if (event.getAuthor().isBot()) {
            return ;
        }

        msg = Parser.parse(event.getMessage().getContentRaw());

        if (msg.equals(CM_DIAGNOSE)) {
            event.getChannel().sendMessage("Looks like you have a sever case of Ligma").queue();
        }
    }
}

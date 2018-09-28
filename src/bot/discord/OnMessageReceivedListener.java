package bot.discord;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class OnMessageReceivedListener extends ListenerAdapter {

    String msg;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        //Make sure he doesn't talk to other bots
        if (event.getAuthor().isBot()) {
            return ;
        }

        Parser.parse(event.getMessage().getContentRaw(), event);
    }
}

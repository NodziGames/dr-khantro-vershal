package bot.discord;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static bot.discord.CommandsList.*;

public class Parser {

    public static void parse(String msg, MessageReceivedEvent event) {

        msg = msg.toLowerCase();

        msg = msg.trim().replaceAll(" +", " ");

        String[] temp_args = msg.split(" ");

        List<String> args = new ArrayList<>();

        args.addAll(Arrays.asList(temp_args));

        //Stop if no args were provided
        if (args.size() == 0) {
            return ;
        }

        //Process Command (First argument)
        switch (args.get(0)) {
            case CM_DIAGNOSE:
                event.getChannel().sendMessage("You've asked me to diagnose you").queue();
                break ;
            case CM_COUNSEL:
                event.getChannel().sendMessage("You've asked me to give you counsel").queue();
                break ;
        }
    }
}

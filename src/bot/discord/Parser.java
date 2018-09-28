package bot.discord;

import bot.discord.commands.*;
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

        List<String> args = new ArrayList<String>();

        args.addAll(Arrays.asList(temp_args));

        //Stop if no args were provided
        if (args.size() == 0) {
            return ;
        }

        //Process Command (First argument)
        switch (args.get(0)) {
            case CM_HELP:
                Help.start(event, args);
                break ;
            case CM_SYMPTOMS:
                Symptoms.start(event, args);
                break ;
            case CM_DIAGNOSE:
                Diagnose.start(event, args);
                break ;
            case CM_COUNSEL:
                Counsel.start(event, args);
                break ;
        }
    }
}

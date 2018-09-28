package bot.discord.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.List;

import static bot.discord.Args.*;
import static bot.discord.CommandsList.*;

public class Diagnose {

    public static void start(MessageReceivedEvent event, List<String> args) {

        if (args.size() != 3) {
            event.getChannel().sendMessage("I can't diagnose you if you don't list two symptoms. A list of available symptoms can be found by typing the following command: " + CM_SYMPTOMS).queue();
        }

        String diagnosis = "";

        if (args.get(1).equals(args.get(2))) {
            event.getChannel().sendMessage("You can't list the same symptom twice...");
        }


        //Increase number as you increase combinations
        int total = 3;

        //Massive if tree for combinations of symptoms
        if (match(args, SM_THROATHURT, SM_ASSPAIN)) {
            event.getChannel().sendMessage("Your diagnosis was successful...\n\nIt looks like you might have a severe case of \"The Big Gay\" (Disease 1 / " + total +")").queue();
        }
        else if (match(args, SM_ASSPAIN, SM_CRAMPS)) {
            event.getChannel().sendMessage("Your diagnosis was successful...\n\nIt looks like you might have a severe case of \"Liquid Ass\" (Disease 2 / " + total +")").queue();
        }
        else if (match(args, SM_THROATHURT, SM_OUCHKNEES)) {
            event.getChannel().sendMessage("Your diagnosis was successful...\n\nIt looks like you might have a severe case of \"Man, That Blows...\" (Disease 3 / " + total +")").queue();
        }
        else {
            event.getChannel().sendMessage("I couldn't diagnose you based on that combination of symptoms. I'd say you probably have 4 weeks left to live though...").queue();
        }


    }

    public static boolean match(List<String> args, String sym1, String sym2) {
        if ((args.get(1).equals(sym1) && args.get(2).equals(sym2)) || (args.get(1).equals(sym2) && args.get(2).equals(sym1))) {
            return true;
        }
        else
            return false;
    }
}

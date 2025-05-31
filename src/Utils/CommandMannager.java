package Utils;

import Commands.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class CommandMannager {
    private final HashMap<String, Command> commands = new HashMap<>();

    public CommandMannager(Command... needComands) {
        for (Command com : needComands){
            commands.put(com.getName().toLowerCase(Locale.ENGLISH), com);
        }

    }

    public boolean isCommandExits(String nameCommand){
        return commands.containsKey(nameCommand);
    }

    public void executeC(String nameCommand){
        if (commands.containsKey(nameCommand)){
            commands.get(nameCommand).execute();
        }
        else{
            System.out.println("ебанутый?");
        }
    }
}

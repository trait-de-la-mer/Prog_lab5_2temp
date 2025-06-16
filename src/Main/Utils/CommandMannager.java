package Main.Utils;

import Main.Commands.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

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

    public void executeC(String... nameCommand){
//        System.out.println(Arrays.toString(nameCommand));
//        System.out.println(nameCommand.length);
//        System.out.println(nameCommand[0] + "132");
//        System.out.println(nameCommand[0] == "");
        if (nameCommand != null && nameCommand.length != 0 && !Objects.equals(nameCommand[0], "")
                && commands.containsKey(nameCommand[0])){
            String[] copyNameCommand = Arrays.copyOf(nameCommand, nameCommand.length + 1);
                if (nameCommand.length == 1){
                    copyNameCommand[1] = null;
                }
                try {
                    commands.get(copyNameCommand[0]).execute(copyNameCommand[1]);
                } catch (Exception ex) {Consoll.printSmt(ex.getMessage());}
            }
        else{
            System.out.println("ебанутый?");
        }
    }
}

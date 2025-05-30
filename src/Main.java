import Commands.*;
import Utils.CommandMannager;

import java.util.Locale;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        CommandMannager cm = new CommandMannager(
                new Clear(),
                new ExecuteScript(),
                new Exit(),
                new Help(),
                new History(),
                new Info(),
                new AddIfMax(),
                new AddIfMin(),
                new CountLessThanType(),
                new FilterLessThanAnnualTurnover(),
                new PrintFieldAscedingPostalAddress(),
                new RemoveLower(),
                new Save(),
                new Show(),
                new Update()
        );
        while (true){
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine().toLowerCase(Locale.ENGLISH);
            System.out.println(cm.isCommandExits(line));
        }
    }
}
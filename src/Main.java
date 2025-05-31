import Collection.Organization;
import Commands.*;
import Utils.CollectionManager;
import Utils.CommandMannager;
import Utils.Consoll;

import java.util.Locale;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Organization test = new Organization();
        CollectionManager collectionManager = new CollectionManager();
        collectionManager.addElement("test", test);
        CommandMannager cm = new CommandMannager(
                new Clear(collectionManager),
                new Printcccc(collectionManager) //УДАЛИТЬ!!!!!!!!!!!!!1
//                new ExecuteScript(),
//                new Exit(),
//                new Help(),
//                new History(),
//                new Info(),
//                new AddIfMax(),
//                new AddIfMin(),
//                new CountLessThanType(),
//                new FilterLessThanAnnualTurnover(),
//                new PrintFieldAscedingPostalAddress(),
//                new RemoveLower(),
//                new Save(),
//                new Show(),
//                new Update()
        );

        Consoll console = new Consoll(cm);
        console.startConsole();
    }
}
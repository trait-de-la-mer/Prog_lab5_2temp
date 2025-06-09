import Collection.Organization;
import Commands.*;
import Utils.CollectionManager;
import Utils.CommandMannager;
import Utils.Consoll;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main
{

    public static void main(String[] args) {
//        Organization test = new Organization();
        CollectionManager collectionManager = new CollectionManager();
//        collectionManager.addElement("test", test);
        CommandMannager cm = new CommandMannager(
                new Clear(collectionManager),
                new Printcccc(collectionManager), //УДАЛИТЬ!!!!!!!!!!!!!1
                new Insert(collectionManager)
        );

        Consoll console = new Consoll(cm);
        console.startConsole();
    }
}
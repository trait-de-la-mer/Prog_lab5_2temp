import Collection.Organization;
import Commands.*;
import Utils.CollectionManager;
import Utils.CommandMannager;
import Utils.Consoll;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main
{

    public static void main(String[] args){
        CollectionManager collectionManager = new CollectionManager();
        CommandMannager cm = new CommandMannager(
                new ExecuteScript(collectionManager),
                new Clear(collectionManager),
                new Printcccc(collectionManager), //УДАЛИТЬ!!!!!!!!!!!!!1
                new Insert(collectionManager),
                new Exit(collectionManager)
        );

        Consoll console = new Consoll(cm);
        console.startConsole();
    }
}
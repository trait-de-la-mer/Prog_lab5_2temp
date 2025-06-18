package Main;

import Main.Collection.Organization;
import Main.Commands.*;
import Main.Utils.CollectionManager;
import Main.Utils.CommandMannager;
import Main.Utils.Consoll;
import Main.Utils.JParser;


public class Main
{

    public static void main(String[] args){
       CollectionManager collectionManager = new CollectionManager();
        JParser jParser = new JParser();
        collectionManager.setOrgCollection(jParser.parse("ewq.json"));
        System.out.println(collectionManager.getOrgCollection());
//        collectionManager.getOrgCollection().get("org2").setAnnualTurnover(325324.0);
//        jParser.convertToJson(collectionManager.getOrgCollection(), "ewq.json");

//        CommandMannager cm = new CommandMannager(
//                new ExecuteScript(collectionManager),
//                new Clear(collectionManager),
//                new Printcccc(collectionManager), //УДАЛИТЬ!!!!!!!!!!!!!1
//                new Insert(collectionManager),
//                new Exit(collectionManager)
//        );
//
//        Consoll console = new Consoll(cm);
//        console.startConsole();
    }
}
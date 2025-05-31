package Utils;

import java.util.Locale;
import java.util.Scanner;

public class Consoll {
    CommandMannager cm;

    public Consoll(CommandMannager commandMannager){
        cm = commandMannager;
    }

    public void startConsole(){
        String line = "";
        Scanner sc = new Scanner(System.in);
        while (!line.equals("stop")){
            line = sc.nextLine().toLowerCase(Locale.ENGLISH);
            cm.executeC(line);
        }
    }

    public void printCns(String str){
        System.out.println(str);
    }
}

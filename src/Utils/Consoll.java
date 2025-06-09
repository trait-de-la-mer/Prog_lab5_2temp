package Utils;

import java.util.Locale;
import java.util.Scanner;

public class Consoll {
    CommandMannager cm;

    public Consoll(CommandMannager commandMannager){
        cm = commandMannager;
    }

    public static String askSmt(String text){
        System.out.printf("Введите %s:", text);
        return new Scanner(System.in).nextLine();
    }

    public void startConsole(){
        String line = "";
        Scanner sc = new Scanner(System.in);
        while (!line.equals("stop")){
            line = sc.nextLine().toLowerCase(Locale.ENGLISH);
            String[] comAndArgs = line.split(" ");
            cm.executeC(comAndArgs);
        }
    }

    public void printCns(String str){
        System.out.println(str);
    }
}

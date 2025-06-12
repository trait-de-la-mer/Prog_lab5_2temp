package Utils;

import java.io.*;
import java.nio.Buffer;
import java.util.Locale;
import java.util.Scanner;

public class Consoll {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static boolean scriptFlag;
    CommandMannager cm;

    public static void setScriptFlag(boolean scriptFlag) {
        Consoll.scriptFlag = scriptFlag;
    }

    public static void setReader(BufferedReader newReader) {
        reader = newReader;
    }


    public Consoll(CommandMannager commandMannager){
        cm = commandMannager;
    }

    public static String askSmt(String textOrFile){
        System.out.printf("Введите %s: ", textOrFile);
        return generateNextLine(null).trim();
    }

    public void startConsole(){
        do{
            String line = generateNextLine(null)
                    .toLowerCase(Locale.ENGLISH).trim().replaceAll("\\s+", " ");
            String[] comAndArgs = line.split(" ");
            cm.executeC(comAndArgs);
        } while (true);
    }

    public static void printSmt(String str){
        System.out.println(str);
    }

    public static String generateNextLine(String file){
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Непредвиденная ошибка ввода");
        }
    }
}

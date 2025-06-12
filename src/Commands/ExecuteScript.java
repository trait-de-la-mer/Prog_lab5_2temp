package Commands;

import Utils.CollectionManager;
import Utils.Consoll;

import java.io.*;
import java.util.ArrayList;

public class ExecuteScript extends Command{
    static ArrayList<String> files = new ArrayList<>();
    {name = "script";}
    public ExecuteScript(CollectionManager cm) {
        super(cm);
    }

    @Override
    public void execute(String file) {
        if (files.contains(file)) throw new IllegalArgumentException("Файл уже в обработке, ты хочешь рекурсию?");
        Consoll.setScriptFlag(true);
        try{
            files.add(file);
            Consoll.setReader(new BufferedReader(new InputStreamReader(new FileInputStream(file))));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Файл: " + file + " - не найден"); //если ошибка прав доступа - мне пизда
        }
    }
}

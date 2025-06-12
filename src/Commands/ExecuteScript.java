package Commands;

import Utils.CollectionManager;
import Utils.Consoll;

import java.io.*;
import java.util.ArrayList;

public class ExecuteScript extends Command{
    {name = "script";}
    public ExecuteScript(CollectionManager cm) {
        super(cm);
    }

    @Override
    public void execute(String file) {
        if (Consoll.getFiles().contains(file)) throw new IllegalArgumentException("Файл уже в обработке, ты хочешь рекурсию?");
        Consoll.setScriptFlag(true);
        try{
            InputStream reader = new FileInputStream(file);
            Consoll.setScriptFlag(true);
            Consoll.addFile(file);
            Consoll.addReader(reader);
            Consoll.setReader(reader);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Файл: " + file + " - не найден"); //если ошибка прав доступа - мне пизда
        }
    }
}

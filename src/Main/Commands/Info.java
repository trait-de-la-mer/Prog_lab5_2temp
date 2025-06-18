package Main.Commands;

import Main.Utils.CollectionManager;
import Main.Utils.CommandMannager;
import Main.Utils.Consoll;

public class Info extends Command{
    {setName("info");
        setInfo("выводит информацию о коллекцииз (тип, дата инициализации, кол-во элементов)");};

    public Info(CollectionManager cm) {
        super(cm);
    }

    @Override
    public void execute(String args) {
        if (!args.isEmpty()) throw new IllegalArgumentException("В команде" + getName() + " не может быть аргументов!");
        Consoll.printSmt(getCollectionManager().getCollectionType());
        Consoll.printSmt(String.valueOf(getCollectionManager().getCollectionSyze()));
        Consoll.printSmt(String.valueOf(getCollectionManager().getCreationDate()));
    }
}

package Main.Commands;

import Main.Utils.CollectionManager;

public class Info extends Command{
    {setName("info");
        setInfo("выводит информацию ...");};

    public Info(CollectionManager cm) {
        super(cm);
    }

    @Override
    public void execute(String arg) {
    }
}

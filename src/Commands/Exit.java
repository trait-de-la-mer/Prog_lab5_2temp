package Commands;

import Utils.CollectionManager;

public class Exit extends Command{
    {name = "exit";}
    public Exit(CollectionManager cm) {
        super(cm);
    }

    @Override
    public void execute(String parametr) {
        System.exit(0);
    }
}

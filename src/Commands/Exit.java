package Commands;

import Utils.CollectionManager;

public class Exit extends Command{
    private String name = "exit";

    public Exit(CollectionManager cm) {
        super(cm);
    }

    public String getName() {
        return name;
    }

    @Override
    public String execute() {
        return "";
    }
}

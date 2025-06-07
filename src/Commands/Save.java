package Commands;

import Utils.CollectionManager;

public class Save extends Command{
    private String name = "save";

    public Save(CollectionManager cm) {
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

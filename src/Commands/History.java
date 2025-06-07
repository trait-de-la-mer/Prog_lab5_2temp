package Commands;

import Utils.CollectionManager;

public class History extends Command{
    private String name = "history";

    public History(CollectionManager cm) {
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

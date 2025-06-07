package Commands;

import Utils.CollectionManager;

public class AddIfMax extends Command{
    private String name = "addIfMax";

    public AddIfMax(CollectionManager cm) {
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

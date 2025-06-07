package Commands;

import Utils.CollectionManager;

public class RemoveLower extends Command{
    private String name = "removeLower";

    public RemoveLower(CollectionManager cm) {
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

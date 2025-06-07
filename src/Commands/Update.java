package Commands;

import Utils.CollectionManager;

public class Update extends Command{
    private String name = "update";

    public Update(CollectionManager cm) {
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

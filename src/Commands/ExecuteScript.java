package Commands;

import Utils.CollectionManager;

public class ExecuteScript extends Command{
    private String name = "executeScript";

    public ExecuteScript(CollectionManager cm) {
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

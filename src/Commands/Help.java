package Commands;

import Utils.CollectionManager;

public class Help extends Command {
    private String name = "help";

    public Help(CollectionManager cm) {
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

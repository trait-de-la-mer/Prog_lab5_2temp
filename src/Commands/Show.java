package Commands;

import Utils.CollectionManager;

public class Show extends Command{
    private String name = "show";

    public Show(CollectionManager cm) {
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

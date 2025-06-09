package Commands;

import Utils.CollectionManager;

public class Info extends Command{
    private String name = "info";

    public Info(CollectionManager cm) {
        super(cm);
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute(String arg) {
    }
}

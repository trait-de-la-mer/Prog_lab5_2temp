package Main.Commands;

import Main.Utils.CollectionManager;

public abstract class Command{
    protected String name = "";
    private final CollectionManager cm;

    public Command(CollectionManager cm){
        this.cm = cm;
    }

    public CollectionManager getCollectionManager() {
        return cm;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(String parametr);
}

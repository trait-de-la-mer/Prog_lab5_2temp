package Commands;

import Utils.CollectionManager;
import Utils.CommandMannager;

public abstract class Command{
    protected String name = "";
    private final CollectionManager cm;

    public CollectionManager getCollectionManager() {
        return cm;
    }

    public Command(CollectionManager cm){
        this.cm = cm;
    }

    public String getName() {
        return name;
    }

    public abstract String execute();
    
}

package Commands;

import Utils.CollectionManager;
import Utils.CommandMannager;

public class Printcccc extends Command{
    CollectionManager cm;
    String name = "print";

    @Override
    public String getName() {
        return name;
    }

    public Printcccc(CollectionManager cm){
        this.cm = cm;
    }

    @Override
    public String execute() {
        cm.printCol();
        return "Succes print";
    }
}

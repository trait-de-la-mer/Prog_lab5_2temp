package Main.Commands;

import Main.Utils.CollectionManager;

public class Printcccc extends Command{
    CollectionManager cm;
    String name = "print";

    @Override
    public String getName() {
        return name;
    }

    public Printcccc(CollectionManager cm){
        super(cm);
        this.cm = cm;
    }

    @Override
    public void execute(String arg) {
        cm.printCol();
    }
}

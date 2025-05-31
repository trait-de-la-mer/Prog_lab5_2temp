package Commands;

import Utils.CollectionManager;

public class Clear extends Command{
    private String name = "clear";
    private final CollectionManager colm;

    public Clear(CollectionManager colm) {
        this.colm = colm;
    }


    public String getName() {
        return name;
    }

    @Override
    public String execute() {
        colm.clearCollection();
        return "";
    }
}

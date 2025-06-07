package Commands;

import Utils.CollectionManager;

public class Clear extends Command{

    public Clear(CollectionManager colm) {
        super(colm);
    }

    @Override
    public String execute() {
        getCollectionManager().clearCollection();
        return "";
    }
}

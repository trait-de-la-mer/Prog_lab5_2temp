package Commands;

import Utils.CollectionManager;

public class Clear extends Command{

    public Clear(CollectionManager colm) {
        super(colm);
    }

    @Override
    public void execute(String args) {
        if (!args.isEmpty()) throw new IllegalArgumentException("В команде clear не может быть аргументов!");
        getCollectionManager().clearCollection();
    }
}

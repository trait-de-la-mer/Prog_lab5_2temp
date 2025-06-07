package Commands;

import Utils.CollectionManager;

public class CountLessThanType extends Command{
    {name = "countLessThanType";}

    public CountLessThanType(CollectionManager cm) {
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


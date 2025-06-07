package Commands;

import Utils.CollectionManager;

public class PrintFieldAscedingPostalAddress extends Command{
    private String name = "printFieldAscedingPostalAddress";

    public PrintFieldAscedingPostalAddress(CollectionManager cm) {
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

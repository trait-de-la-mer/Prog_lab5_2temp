package Commands;

import Utils.CollectionManager;

public class FilterLessThanAnnualTurnover extends Command{
    private String name = "filterLessThanAnnualTurnover";

    public FilterLessThanAnnualTurnover(CollectionManager cm) {
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

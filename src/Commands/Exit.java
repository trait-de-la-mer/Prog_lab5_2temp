package Commands;

public class Exit extends Command{
    private String name = "exit";

    public String getName() {
        return name;
    }

    @Override
    public String execute() {
        return "";
    }
}

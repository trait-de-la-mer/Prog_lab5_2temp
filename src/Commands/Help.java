package Commands;

public class Help extends Command {
    private String name = "help";

    public String getName() {
        return name;
    }

    @Override
    public String execute() {
        return "";
    }
}

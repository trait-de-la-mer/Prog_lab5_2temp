package Commands;

public abstract class Command{
    private String name;

    public String getName() {
        return name;
    }

    public abstract void execute();
    
}

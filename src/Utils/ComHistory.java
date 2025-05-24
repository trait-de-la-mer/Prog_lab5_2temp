package Utils;

public class ComHistory {
    private final String[] history;
    public ComHistory(){
        this.history = new String[14];
    }

    public String[] getHistory(){
        return this.history;
    }

    public void addInHistory(String newCom){
        for (int i = 0; i < 13; i++){
            history[i] = history[i + 1];
        }
        history[13] = newCom;
    }
}

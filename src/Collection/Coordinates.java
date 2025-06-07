package Collection;

public class Coordinates {
    private Integer x;
    private long y;

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x + ";" + y;
    }
}
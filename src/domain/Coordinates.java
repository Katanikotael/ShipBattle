package domain;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = y;
        this.y = x;
    }

    public void setCoords (int x, int y) {
        this.x = y;
        this.y = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

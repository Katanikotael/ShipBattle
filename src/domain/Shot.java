package domain;

public class Shot {

    Coordinates coords;

    public Shot (int l, int d) {
        this.coords = new Coordinates(l, d);
    }

    public Coordinates getCoords() {
        return coords;
    }
}

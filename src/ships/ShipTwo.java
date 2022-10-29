package ships;

import domain.Coordinates;

public class ShipTwo extends Ship{

    public ShipTwo(int x, int y) {
        super(2);
        this.coords[0] = new Coordinates(x, y);
        for (int i = 1; i < this.coords.length; i++) {
            this.coords[i] = new Coordinates(x, y + i);
        }
    }
}

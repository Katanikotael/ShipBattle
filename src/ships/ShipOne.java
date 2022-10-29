package ships;

import domain.Coordinates;

public class ShipOne extends Ship {

    public ShipOne(int x, int y) {
        super(1);
        this.coords[0] = new Coordinates(x, y);
    }
}
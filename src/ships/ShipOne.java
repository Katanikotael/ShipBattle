package ships;

import domain.Coordinates;

public class ShipOne extends Ship {

    public ShipOne(int l, int d) {
        super(1);
        this.coords[0] = new Coordinates(l, d);
    }
}

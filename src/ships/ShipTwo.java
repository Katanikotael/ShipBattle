package ships;

import domain.Coordinates;
import domain.Direction;

import java.util.Random;

public class ShipTwo extends Ship{

    public ShipTwo(int l, int d) {
        super(2);
        Random rnd = new Random();
        l = rnd.nextInt(10);
        d = rnd.nextInt(10);
        Direction dir = Direction.getRandomDirection();
        this.coords[0] = new Coordinates(l, d);
        for (int i = 1; i < this.coords.length; i++) {
            this.coords[i] = new Coordinates(dir.getL(l, d, i), dir.getD(l, d, i));
        }
    }
}

package ships;

import domain.Coordinates;

public class Ship {
    final int size;
    public Coordinates[] coords;


    public Ship(int size) {
        this.size = size;
        this.coords = new Coordinates[size];
    }

    public int getBlockD(int blockNum) {
        return coords[blockNum].getD();
    }

    public int getBlockL(int blockNum) {
        return coords[blockNum].getL();
    }

    public int getSize() {
        return size;
    }

}

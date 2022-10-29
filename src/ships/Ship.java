package ships;

import domain.Coordinates;

public class Ship {
    final int size;
    public Coordinates[] coords;


    public Ship(int size) {
        this.size = size;
        this.coords = new Coordinates[size];
    }

    public int getBlockX (int blockNum) {
        return coords[blockNum].getX();
    }

    public int getBlockY (int blockNum) {
        return coords[blockNum].getY();
    }

    public int getSize() {
        return size;
    }
}

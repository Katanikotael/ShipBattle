package fields;

import ships.Ship;

public class Field {

    public int[][] matrix;

    public Field() {
        this.matrix = new int[10][10];
    }

    public void deployShip (Ship ship) {
        for (int i = 0; i < ship.getSize(); i++) {
            this.matrix[ship.getBlockX(i)][ship.getBlockY(i)] = 1;
        }
    }

    public void print () {
        for (int[] ints : this.matrix) {
            for (int i = 0; i < ints.length; i++) {
                System.out.print(ints[i] + " ");
            }
            System.out.println();
        }
    }
}

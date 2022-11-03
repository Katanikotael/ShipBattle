package fields;

import ships.Ship;

public class Field {

    public int[][] matrix;

    public Field() {
        this.matrix = new int[10][10];
    }

    public void deployShip (Ship ship) {
        for (int i = 0; i < ship.getSize(); i++) {
            this.matrix[ship.getBlockD(i)][ship.getBlockL(i)] = 1;
        }
    }

    public void print () {
        System.out.println("   А Б В Г Д Е Ж З И К");
        int k = 1;
        for (int[] ints : this.matrix) {
            System.out.print(k + " ");
            if (k != 10) System.out.print(" ");
            k++;
            for (int i = 0; i < ints.length; i++) {
                System.out.print(ints[i] + " ");
            }
            System.out.println();
        }
    }
}

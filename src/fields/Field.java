package fields;

public class Field {

    public int[][] matrix;

    public Field() {
        this.matrix = new int[10][10];
    }

    public void print () {
        System.out.println("   А Б В Г Д Е Ж З И К");
        int k = 1;
        for (int[] ints : this.matrix) {
            System.out.print(k + " ");
            if (k != 10) System.out.print(" ");
            k++;
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    /*
    Scans the game field for live ships.
     */
    public boolean aliveChecker() {
        for (int[] ints: this.matrix) {
            for (int anInt: ints) {
                if (anInt == 1) { return true; }
            }
        }
        return false;
    }
}

package fields;

public class FieldPlayer extends Field {

    public boolean AliveChecker() {
        int count = 0;
        for (int[] ints: this.matrix) {
            for (int anInt: ints) {
                if (anInt == 1) {
                    count++;
                }
            }
        }
        return count < 20;
    }
}

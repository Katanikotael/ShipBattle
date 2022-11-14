package fields;

public class FieldBot extends Field {



    public boolean AliveChecker() {
        for (int[] ints: this.matrix) {
            for (int anInt: ints) {
                if (anInt == 1) { return true; }
            }
        }
        return false;
    }

}

package fields;

import cycle.GameCycle;

public class FieldBot extends Field {



    public boolean AliveChecker() {
        for (int[] ints: this.matrix) {
            for (int anInt: ints) {
                if (anInt == 1) {
                    return true;
                }
            }
        }
        GameCycle.playerWin = true;
        return false;
    }

}

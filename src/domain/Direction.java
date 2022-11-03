package domain;

import java.util.Random;

public enum Direction {
    /**
     * LEFT (l - i)
     * RIGHT (l + i)
     * UP (d - i)
     * DOWN (d + i)
     */

    LEFT {
        public int getL(int l, int d, int i) { return l - i; }
        public int getD(int l, int d, int i) { return d; }
    },

    RIGHT {
        public int getL(int l, int d, int i) { return l + i; }
        public int getD(int l, int d, int i) { return d; }
    },

    UP {
        public int getL(int l, int d, int i) { return l; }
        public int getD(int l, int d, int i) { return d - i; }
    },

    DOWN {
        public int getL(int l, int d, int i) { return l; }
        public int getD(int l, int d, int i) { return d + i; }
    };

    public abstract int getL(int l, int d, int i);
    public abstract int getD(int l, int d, int i);

    public static Direction getRandomDirection() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

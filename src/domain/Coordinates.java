package domain;

/**
 * Формат обращения в двумерном массиве: строка / столбец.
 * Формат для игрового поля столбец (буква) / строка (цифра).
 * Для этого в классе координат x / y меняем местами.
*/

public class Coordinates {
    private int d;
    private int l;

    public Coordinates(int x, int y) {
        this.d = y;
        this.l = x;
    }

    public void setCoords (int x, int y) {
        this.d = y;
        this.l = x;
    }

    public int getD() {
        return d;
    }

    public int getL() {
        return l;
    }
}

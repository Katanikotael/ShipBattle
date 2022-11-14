package services;

import domain.Coordinates;
import fields.Field;

public class ValueTileChecker {

    public static boolean ZeroCheck(Field field, Coordinates coords) {
        return field.matrix[coords.getD()][coords.getL()] == 0;
    }

    public static boolean EightCheck(Field field, Coordinates coords) {
        return field.matrix[coords.getD()][coords.getL()] == 8;
    }

}

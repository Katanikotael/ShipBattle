package services;

import domain.Coordinates;
import fields.Field;

public class ZeroTileChecker {

    public static boolean check(Field field, Coordinates coords) {
        return field.matrix[coords.getD()][coords.getL()] == 0;
    }
}

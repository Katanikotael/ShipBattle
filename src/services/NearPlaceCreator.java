package services;

import domain.Coordinates;
import fields.Field;
import ships.Ship;

public class NearPlaceCreator {

    public static void create (Field field, Ship ship) {
        for (Coordinates shipCoord: ship.coords) {
            markAroundTile(field, shipCoord);
        }
    }

    private static void markAroundTile (Field field, Coordinates coord) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int d = coord.getD() + i;
                int l = coord.getL() + j;
                if (coordinateValidator(d, l)) {
                    if ((field.matrix[coord.getD() + i][coord.getL() + j]) == 0) {
                        field.matrix[coord.getD() + i][coord.getL() + j] = 8;
                    }
                }
            }
        }
    }

    private static boolean coordinateValidator (int d, int l) {
        return d >= 0 && d <= 9 && l >= 0 && l <= 9;
    }

}

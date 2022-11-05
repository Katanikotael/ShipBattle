package services;

import domain.Coordinates;
import domain.Direction;
import fields.Field;

import java.util.ArrayList;
import java.util.Arrays;

public class ShipAliveChecker {

    public static boolean check (Field field, Coordinates coords) {
        ArrayList<Direction> listOfDirections = new ArrayList<>(Arrays.asList(Direction.values()));
        for (Direction dir: listOfDirections) {
            for (int i = 1; i < 6; i++) {
                int l = dir.getL(coords.getL(), coords.getD(), i);
                int d = dir.getD(coords.getL(), coords.getD(), i);
                if (CoordsInsideFieldValidator.validate(l, d)) {
                    int currentTileValue = field.matrix[d][l];
                    if (currentTileValue == 8) {
                        break;
                    } else if (currentTileValue == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

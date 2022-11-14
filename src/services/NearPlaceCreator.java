package services;

import domain.BotCommand;
import domain.Coordinates;
import fields.Field;
import ships.Ship;

public class NearPlaceCreator {

    /*
    Marks tiles around ship as busy.
    That does not allow to deploy ships near each other.
     */
    public static void create (Field field, Ship ship) {
        for (Coordinates shipCoord: ship.coords) {
            markAroundTile(field, shipCoord);
        }
    }

    public static void createForBot (Field field, Ship ship) {
        for (int i = 0; i < BotCommand.dmgBlocks; i++) {
            markAroundTile(field, BotCommand.ship.coords[i]);
        }
    }

    private static void markAroundTile (Field field, Coordinates coord) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int d = coord.getD() + i;
                int l = coord.getL() + j;
                Coordinates newCoords = new Coordinates(l, d);
                if (CoordsInsideFieldValidator.validate(newCoords)) {
                    if ((field.matrix[d][l]) == 0) {
                        field.matrix[d][l] = 8;
                    }
                }
            }
        }
    }

//    private static boolean coordinateValidator (int d, int l) {
//        return d >= 0 && d <= 9 && l >= 0 && l <= 9;
//    }

}

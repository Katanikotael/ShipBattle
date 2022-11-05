package services;

import domain.Coordinates;
import domain.Direction;
import fields.Field;
import ships.Ship;

public class ValidCoordinatesGenerator {

    /*
    Generate coordinates for ship.
    Validate coordinates.
    If coordinates not valid repeat generation.
     */
    public static void generate(Field field, Ship ship) {
        ShipCoordinatesGenerator.setPlace(ship);
        boolean isCheck = ShipOnFieldCoordinatesValidator.validate(field, ship);
        while (!isCheck) {
            ShipCoordinatesGenerator.setPlace(ship);
            isCheck = ShipOnFieldCoordinatesValidator.validate(field, ship);
        }
    }

    public static void manualGenerate(Ship ship, int l, int d, Direction dir) {
        ship.coords[0] = new Coordinates(l, d);
        for (int i = 1; i < ship.getSize(); i++) {
            Coordinates currentCoordinate = new Coordinates(dir.getL(l, d, i), dir.getD(l, d, i));
            ship.coords[i] = currentCoordinate;
        }
    }
}

package services;

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
}

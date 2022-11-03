package services;

import fields.Field;
import ships.Ship;

public class ShipPlacer {

    public static void placeShip(Field field, Ship ship) {
        ShipCoordinatesGenerator.setPlace(ship);
        boolean isCheck = ShipOnFieldCoordinatesValidator.validate(field, ship);
        while (!isCheck) {
            ShipCoordinatesGenerator.setPlace(ship);
            isCheck = ShipOnFieldCoordinatesValidator.validate(field, ship);
        }
    }
}

package services;

import domain.Coordinates;
import fields.Field;
import ships.Ship;

/**
 * Scans field to deployed ships and checks new ship's coordinates on valid values to deploy it.
 */

public class ShipOnFieldCoordinatesValidator {

     public static boolean validate(Field field, Ship ship) {
          for (Coordinates shipCoord: ship.coords) {
               if (field.matrix[shipCoord.getD()][shipCoord.getL()] != 0) {
                    return false;
               }
          }
          return true;
     }
}

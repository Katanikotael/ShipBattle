package services;

import domain.Coordinates;
import domain.Direction;
import ships.Ship;

/**
 * Generate valid coordinates for ship.
 */

public class ShipCoordinatesGenerator {

    // Generate and checks coordinates. Repeats generate if check failed.
    public static void setPlace(Ship ship) {
        generatePlace(ship);
        boolean isCheck = checkPlace(ship);
        while (!isCheck) {
            generatePlace(ship);
            isCheck = checkPlace(ship);
        }
    }

    // Generates random ship's coordinates.
    private static void generatePlace(Ship ship) {
        Direction dir = Direction.getRandomDirection();
        ship.coords[0] = RandomCoordinatesGenerator.generate();
        int l = ship.coords[0].getL();
        int d = ship.coords[0].getD();
        for (int i = 1; i < ship.coords.length; i++) {
            Coordinates currentCoordinate = new Coordinates(dir.getL(l, d, i), dir.getD(l, d, i));
            ship.coords[i] = currentCoordinate;
        }
    }


    // Checks ship's coordinates to valid values.
    private static boolean checkPlace(Ship ship) {
        for (Coordinates nextCoord: ship.coords) {
            if ((nextCoord.getL() < 0 || nextCoord.getL() > 9) || (nextCoord.getD() < 0 || nextCoord.getD() > 9)) {
                return false;
            }
        }
        return true;
    }
}

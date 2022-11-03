package services;

import domain.Coordinates;
import domain.Direction;
import ships.Ship;

import java.util.Random;

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
        int l, d;
        Random rnd = new Random();
        l = rnd.nextInt(10);
        d = rnd.nextInt(10);
        Direction dir = Direction.getRandomDirection();
        ship.coords[0] = new Coordinates(l, d);
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

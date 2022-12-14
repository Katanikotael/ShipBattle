package services;

import domain.Direction;
import ships.Ship;

public class DirectionDeterminer {

    public static Direction determine(Ship ship) {
        int diffL = ship.getBlockL(0) - ship.getBlockL(1);
        if (Math.abs(diffL) == 1) {
            return Direction.getRandomHorizontalDirection();
        } else {
            return Direction.getRandomVerticalDirection();
        }
    }
}

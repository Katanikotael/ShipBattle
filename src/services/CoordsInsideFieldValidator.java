package services;

import domain.Coordinates;

public class CoordsInsideFieldValidator {

    public static boolean validate(Coordinates coords) {
        return coords.getD() >= 0 && coords.getD() <= 9 && coords.getL() >= 0 && coords.getL() <= 9;
    }
}

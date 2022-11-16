package services;

import domain.*;
import fields.Field;

public class ShotGenerator {

    public static Shot ShotWithKnownShipDirection(Field field, Command com) {
        Coordinates coordsFirstShot = BotCommand.ship.coords[0];
        int l = coordsFirstShot.getL();
        int d = coordsFirstShot.getD();
        Direction dir = DirectionDeterminer.determine(BotCommand.ship);
        for (int i = 0; i < 7; i++) {
            Coordinates newCoords = new Coordinates(dir.getL(l, d, i), dir.getD(l, d, i));
            if (CoordsInsideFieldValidator.validate(newCoords) && ValueTileChecker.ZeroCheck(field, newCoords)) {
                com.setShot(new Shot(newCoords));
                return new Shot(newCoords);
            } else if (CoordsInsideFieldValidator.validate(newCoords) && ValueTileChecker.EightCheck(field, newCoords)) {
                break;
            }
        }
        for (int i = 0; i > -7; i--) {
            Coordinates newCoords = new Coordinates(dir.getL(l, d, i), dir.getD(l, d, i));
            if (CoordsInsideFieldValidator.validate(newCoords) && ValueTileChecker.ZeroCheck(field, newCoords)) {
                com.setShot(new Shot(newCoords));
                return new Shot(newCoords);
            } else if (CoordsInsideFieldValidator.validate(newCoords) && ValueTileChecker.EightCheck(field, newCoords)) {
                break;
            }
        }
        System.out.println("ОШИБКА!");
        return new Shot(coordsFirstShot);
    }
}

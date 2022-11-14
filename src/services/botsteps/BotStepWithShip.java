package services.botsteps;

import domain.*;
import fields.Field;
import services.CoordsInsideFieldValidator;
import services.ShotGenerator;
import services.ValueTileChecker;

public class BotStepWithShip implements BotStep {
    @Override
    public void run(Field field, Command com) {

        if (BotCommand.dmgBlocks == 1) {
            Coordinates coordsFirstShot = BotCommand.ship.coords[0];
            int l = coordsFirstShot.getL();
            int d = coordsFirstShot.getD();
            Direction dir = Direction.getRandomDirection();
            int i = 1;
            Coordinates newCoords = new Coordinates(dir.getL(l, d, i), dir.getD(l, d, i));
            boolean isCheck = CoordsInsideFieldValidator.validate(newCoords) && ValueTileChecker.ZeroCheck(field, newCoords);
            while (!isCheck) {
                dir = Direction.getRandomDirection();
                newCoords = new Coordinates(dir.getL(l, d, i), dir.getD(l, d, i));
                isCheck = CoordsInsideFieldValidator.validate(newCoords) && ValueTileChecker.ZeroCheck(field, newCoords);
            }
            com.setShot(new Shot(newCoords));

        } else {
            com.setShot(ShotGenerator.ShotWithKnownShipDirection(field, com));
        }
    }
}

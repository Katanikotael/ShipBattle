package services.botsteps;

import domain.Command;
import domain.Coordinates;
import domain.Shot;
import fields.Field;
import services.CoordsInsideFieldValidator;
import services.RandomCoordinatesGenerator;
import services.ValueTileChecker;

public class BotStepWithoutShip implements BotStep {
    @Override
    public void run(Field field, Command com) {
        com.setShot(new Shot(RandomCoordinatesGenerator.generate()));
        Coordinates coords = com.getShot().getCoords();
        boolean isCheck = CoordsInsideFieldValidator.validate(coords) && ValueTileChecker.ZeroCheck(field, com.getShot().getCoords());
        while (!isCheck) {
            com.setShot(new Shot(RandomCoordinatesGenerator.generate()));
            isCheck = CoordsInsideFieldValidator.validate(coords) && ValueTileChecker.ZeroCheck(field, com.getShot().getCoords());
        }
    }
}

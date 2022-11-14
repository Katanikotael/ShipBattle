package services.results;

import domain.BotCommand;
import domain.Command;
import fields.Field;
import services.NearPlaceCreator;
import ships.ShipDamaged;

public class ResultsKill implements Results {

    @Override
    public void run(Field field, Command com) {
        int l = com.getShot().getCoords().getL();
        int d = com.getShot().getCoords().getD();
        field.matrix[d][l] = 1;

        if (BotCommand.dmgBlocks == 0) {
            BotCommand.ship = new ShipDamaged();
        }
        BotCommand.ship.coords[BotCommand.dmgBlocks++] = com.getShot().getCoords();

        NearPlaceCreator.createForBot(field, BotCommand.ship);
        BotCommand.isDamagedShip = false;
        BotCommand.dmgBlocks = 0;
    }
}

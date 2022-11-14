package services.results;

import domain.BotCommand;
import domain.Command;
import fields.Field;
import ships.ShipDamaged;

public class ResultsHit implements Results {

    @Override
    public void run(Field field, Command com) {
        int l = com.getShot().getCoords().getL();
        int d = com.getShot().getCoords().getD();
        field.matrix[d][l] = 1;

        if (BotCommand.dmgBlocks == 0) {
            BotCommand.isDamagedShip = true;
            BotCommand.ship = new ShipDamaged();
        }

        BotCommand.ship.coords[BotCommand.dmgBlocks++] = com.getShot().getCoords();
    }
}

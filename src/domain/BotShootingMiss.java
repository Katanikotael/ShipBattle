package domain;

import cycle.GameStep;
import fields.Field;

public class BotShootingMiss implements Shooting {

    @Override
    public void run(Field field, Command com) {
        BotCommand.answer = "нет";
        GameStep.isPlayerTurn = true;
    }
}

package services.botsteps;

import domain.BotCommand;
import fields.Field;

import java.util.HashMap;

public class StepTypeMap {

    private final HashMap<Boolean, BotStep> map;

    public StepTypeMap() {
        map = new HashMap<>();
        map.put(true, new BotStepWithShip());
        map.put(false, new BotStepWithoutShip());
    }

    public void selectType(Field field, BotCommand com) {
        map.get(BotCommand.isDamagedShip).run(field, com);
    }
}

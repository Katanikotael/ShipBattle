package services.botsteps;

import domain.Command;
import fields.Field;

public interface BotStep {
    void run(Field field, Command com);
}

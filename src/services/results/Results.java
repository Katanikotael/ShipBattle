package services.results;

import domain.Command;
import fields.Field;

public interface Results {

    void run(Field field, Command com);
}

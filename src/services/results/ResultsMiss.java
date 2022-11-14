package services.results;

import cycle.GameStep;
import domain.Command;
import fields.Field;

public class ResultsMiss implements Results {
    @Override
    public void run(Field field, Command com) {
        int l = com.getShot().getCoords().getL();
        int d = com.getShot().getCoords().getD();
        field.matrix[d][l] = 8;
        GameStep.isPlayerTurn = true;
    }
}

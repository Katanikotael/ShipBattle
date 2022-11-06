package cycle;

import fields.Field;

public class GameCycle {

    public static void run(Field field) {
        boolean isInGame = true;

        while (isInGame) {
            GameStep.playerTurn(field);
            isInGame = field.aliveChecker();
        }

        GameOver.run();
    }
}

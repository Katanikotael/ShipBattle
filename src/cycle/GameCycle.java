package cycle;

import fields.Field;

public class GameCycle {

    public static void run(Field botField, Field playerField) {
        boolean isInGame = true;
        GameStep.isPlayerTurn = false;

        while (isInGame) {
            if (GameStep.isPlayerTurn) {
                GameStep.playerTurn(botField);
                isInGame = botField.aliveChecker();
            } else {
                GameStep.botTurn(playerField);
            }
        }

        GameOver.run();
    }
}

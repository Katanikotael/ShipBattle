package cycle;

import fields.Field;

public class GameCycle {

    public static void run(Field botField, Field playerField) {
        boolean isInGame = true;
        System.out.println("цикл игры");

        while (isInGame) {
            if (GameStep.isPlayerTurn) {
                GameStep.playerTurn(botField);
                isInGame = botField.AliveChecker();
            } else {
                GameStep.botTurn(playerField);
                isInGame = playerField.AliveChecker();
            }
        }

        GameOver.run();
    }
}

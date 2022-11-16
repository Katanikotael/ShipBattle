package cycle;

import fields.Field;

public class GameCycle {
    public static boolean playerWin = false;

    public static void run(Field botField, Field playerField) {
        RockPapperScissors.run();

        boolean isInGame = true;
        while (isInGame) {
            if (GameStep.isPlayerTurn) {
                GameStep.playerTurn(botField);
                isInGame = botField.AliveChecker();
            } else {
                GameStep.botTurn(playerField);
                isInGame = playerField.AliveChecker();
            }
        }

        if (playerWin) {
            GameOver.playerWin();
        } else {
            GameOver.botWin();
        }
    }
}

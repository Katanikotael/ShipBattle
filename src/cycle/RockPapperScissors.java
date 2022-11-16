package cycle;

import services.rpsminigame.RpsGame;

public class RockPapperScissors {
    public static void run() {
        System.out.println("Определим, кто ходит первым, игрой в камень/ножницы/бумагу.\nНапиши, что покажешь?");
        GameStep.isPlayerTurn = RpsGame.run();
    }
}

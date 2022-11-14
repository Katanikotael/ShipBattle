package cycle;

import domain.*;
import fields.Field;
import services.CharTranslater;
import services.PlayerCommandValidator;
import services.PlayerShooting;
import services.botsteps.StepTypeMap;
import services.results.ResultsMap;

public class GameStep {

    public static boolean isPlayerTurn;

    public static void playerTurn(Field field) {
        System.out.println("ход игрока");
        PlayerCommand com = new PlayerCommand();
        com.setCommand(com.getSc().nextLine());
        boolean isCheck = PlayerCommandValidator.validate(com.getCommand());
        while (!isCheck) {
            com.setCommand(com.getSc().nextLine());
            isCheck = PlayerCommandValidator.validate(com.getCommand());
        }
        com.setShot(new Shot(CharTranslater.convert(com.getCommand())));
        PlayerShooting shooting = new PlayerShooting();
        shooting.run(field, com);
    }

    public static void botTurn(Field field) {
        System.out.println("ход бота");
        BotCommand com = new BotCommand();
        botShoot(field, com);

        System.out.println();
    }


    private static void botShoot(Field field, BotCommand com) {

        StepTypeMap stepType = new StepTypeMap();
        stepType.selectType(field, com);

        System.out.println(CharTranslater.convert(com.getShot().getCoords()));
        BotCommand.answer = BotCommand.sc.nextLine();

        ResultsMap resMap = new ResultsMap();
        boolean isCheck = resMap.keyCheck(BotCommand.answer);
        while (!isCheck) {
            System.out.println("answer error");
            BotCommand.answer = BotCommand.sc.nextLine();
            isCheck = resMap.keyCheck(BotCommand.answer);
        }

        resMap.getResults(field, com);
    }
}

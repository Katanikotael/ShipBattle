package cycle;

import domain.BotCommand;
import domain.Shot;
import fields.Field;
import domain.PlayerCommand;
import services.CharTranslater;
import services.RandomCoordinatesGenerator;
import services.ShipAliveChecker;
import services.ZeroTileChecker;

public class GameStep {

    static boolean isPlayerTurn;

    public static void playerTurn(Field field) {
        System.out.println("ход игрока");
        PlayerCommand com = new PlayerCommand();
        Shot shot = new Shot(com.getCoords().getL(), com.getCoords().getD());
        playerShoot(field, shot);
        //проверка на попадание
        //если мимо - ход переходит
        //если попал - стреляет ещё раз.
    }

    public static void botTurn(Field field) {
        System.out.println("ход бота");
        //создаем команду, которая будет содержать координаты (для выстрела и для вывода в консоль через конвертер)
        BotCommand com = new BotCommand();
        //генерируем случайные координаты
        com.setCoords(RandomCoordinatesGenerator.generate());
        //чекер должен проверить координаты на валидность, в случае ошибки сгенерировать новые координаты.
        boolean isCheck = ZeroTileChecker.check(field, com.getCoords());
        while (!isCheck) {
            com.setCoords(RandomCoordinatesGenerator.generate());
            isCheck = ZeroTileChecker.check(field, com.getCoords());
        }
        //выводим в консоль координаты через конвертер
        System.out.println(CharTranslater.convert(com.getCoords()));
        //принимаем из консоли ответ (мимо, ранил, убил)
        com.setAnswer();
            //в случае мимо - заканчиваем ход (отмечаем клетку как 1)
        if (!com.getAnswer().equals("мимо")) {
            //заглушка
            field.matrix[com.getCoords().getD()][com.getCoords().getL()] = 1;
            field.print();
            System.out.println("_______\n");
        } else {
            isPlayerTurn = true;
        }
            //в случае ранил - стреляем в соседние клетки
            //в случае убил - обводим корабль, стреляем в рандом.
    }

    private static void playerShoot(Field field, Shot shot) {
        int l = shot.getCoords().getL();
        int d = shot.getCoords().getD();
        System.out.printf("Shot: %d, %d\n", l, d);
        if (field.matrix[d][l] == 1) { //hit
            field.matrix[d][l] = 3;

            if (ShipAliveChecker.check(field, shot.getCoords())) {
                System.out.println("Hit!"); // injury
            } else {
                System.out.println("Kill!"); } // death

        } else { // miss
            System.out.println("Miss!");
        }
        field.print();
    }

    private static void botShoot(Field field, Shot shot) {
    }
}

package domain;

import fields.Field;

public class BotShootingFirst implements Shooting {
    @Override
    public void run(Field field, Command com) {
        System.out.println("первый выстрел!");
        BotCommand.answer = BotCommand.sc.nextLine();
    }
}

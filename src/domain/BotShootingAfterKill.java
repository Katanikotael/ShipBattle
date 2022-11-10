package domain;

import fields.Field;

public class BotShootingAfterKill implements Shooting {
    @Override
    public void run(Field field, Command com) {
        System.out.println("Высрел после убийства");
        BotCommand.answer = BotCommand.sc.nextLine();
    }
}

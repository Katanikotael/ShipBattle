package domain;

import fields.Field;

public class BotShootingAfterHit implements Shooting {
    @Override
    public void run(Field field, Command com) {
        System.out.println("Высрел после ранения.");
        BotCommand.answer = BotCommand.sc.nextLine();
    }
}

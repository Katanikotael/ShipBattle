package domain;

import fields.Field;

import java.util.HashMap;

public class AnswersMap {

    private final HashMap<String, Shooting> map;

    public AnswersMap() {
        map = new HashMap<>();
        map.put("ранил", new BotShootingAfterHit());
        map.put("убил", new BotShootingAfterKill());
        map.put("мимо", new BotShootingMiss());
        map.put("нет", new BotShootingFirst());
    }

    public void getShooting(Field field, BotCommand com) {
        map.get(BotCommand.getAnswer()).run(field, com);
    }
}

package services.results;

import domain.BotCommand;
import domain.Command;
import fields.Field;

import java.util.HashMap;

public class ResultsMap {

    private final HashMap<String, Results> map;

    public ResultsMap() {
        map = new HashMap<>();
        map.put("мимо", new ResultsMiss());
        map.put("ранил", new ResultsHit());
        map.put("убил", new ResultsKill());
    }

    public void getResults(Field field, Command com) {
        map.get(BotCommand.getAnswer()).run(field, com);
    }

    public HashMap<String, Results> getMap() {
        return map;
    }

    public boolean keyCheck(String str) {
        return map.containsKey(str);
    }
}

package services;

import domain.Coordinates;

import java.util.HashMap;

public class CharTranslater {

    public static int replacer(String str) {
        HashMap<String, Integer> vocabulary = new HashMap<>();
        vocabulary.put("а", 0);
        vocabulary.put("б", 1);
        vocabulary.put("в", 2);
        vocabulary.put("г", 3);
        vocabulary.put("д", 4);
        vocabulary.put("е", 5);
        vocabulary.put("ж", 6);
        vocabulary.put("з", 7);
        vocabulary.put("и", 8);
        vocabulary.put("к", 9);

        return vocabulary.get(str);
    }

    public static Coordinates convert(String str) {
        String[] chars = str.toLowerCase().trim().split(" ");
        int l = replacer(chars[0]);
        int d = Integer.parseInt(chars[1]) - 1;
        return  new Coordinates(l, d);
    }
}

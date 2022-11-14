package services;

import domain.Coordinates;

import java.util.HashMap;

public class CharTranslater {

    private static int replacer(String str) {
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

    private static String replacer(int i) {
        HashMap<Integer, String> vocabulary = new HashMap<>();
        vocabulary.put(0, "А");
        vocabulary.put(1, "Б");
        vocabulary.put(2, "В");
        vocabulary.put(3, "Г");
        vocabulary.put(4, "Д");
        vocabulary.put(5, "Е");
        vocabulary.put(6, "Ж");
        vocabulary.put(7, "З");
        vocabulary.put(8, "И");
        vocabulary.put(9, "К");

        return vocabulary.get(i);
    }

    public static Coordinates convert(String str) {
//        String[] chars = str.toLowerCase().trim().split(" ");
        String newStr = str.toLowerCase().replace(" ", "");
        String[] chars = new String[2];
        chars[0] = newStr.substring(0, 1);
        chars[1] = newStr.substring(1);
        int l = replacer(chars[0]);
        int d = Integer.parseInt(chars[1]) - 1;
        return  new Coordinates(l, d);
    }

    public static String convert(Coordinates coords) {
        String l = replacer(coords.getL());
        String d = String.valueOf(coords.getD() + 1);
        return String.format("%s %s", l, d);
    }
}

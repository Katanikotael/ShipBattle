package services;

import java.util.ArrayList;

public class PlayerCommandValidator {

    private final static ArrayList<String> letters = new ArrayList<>();
    private final static ArrayList<String> digits = new ArrayList<>();

    public static boolean validate(String str) {
        letterConstrunct();
        digitsConstrunct();
        String newStr = str.toLowerCase().replace(" ", "");
        if (newStr.length() > 3 || newStr.length() < 2) {
            System.out.println("не формат");
            return false;
        }
        String[] chars = new String[2];
        chars[0] = newStr.substring(0, 1);
        chars[1] = newStr.substring(1);
        if (!letters.contains(chars[0]) || !digits.contains(chars[1])) {
            System.out.println("не совпадает");
            return false;
        }
        return true;
    }

    private static void letterConstrunct() {
        letters.add("а");
        letters.add("б");
        letters.add("в");
        letters.add("г");
        letters.add("д");
        letters.add("е");
        letters.add("ж");
        letters.add("з");
        letters.add("и");
        letters.add("к");
    }

    private static void digitsConstrunct() {
        digits.add("1");
        digits.add("2");
        digits.add("3");
        digits.add("4");
        digits.add("5");
        digits.add("6");
        digits.add("7");
        digits.add("8");
        digits.add("9");
        digits.add("10");
    }
}

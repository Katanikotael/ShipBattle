package services;

public class CoordsInsideFieldValidator {

    public static boolean validate(int l, int d) { return d >= 0 && d <= 9 && l >= 0 && l <= 9; }
}

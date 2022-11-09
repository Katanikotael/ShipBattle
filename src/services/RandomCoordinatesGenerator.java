package services;

import domain.Coordinates;

import java.util.Random;

public class RandomCoordinatesGenerator {

    public static Coordinates generate() {
        int l, d;
        Random rnd = new Random();
        l = rnd.nextInt(10);
        d = rnd.nextInt(10);
        return new Coordinates(l, d);
    }
}

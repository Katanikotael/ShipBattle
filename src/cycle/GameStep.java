package cycle;

import domain.Shot;
import fields.Field;
import services.ShipAliveChecker;

public class GameStep {

    public static void playerTurn(Field field) {
        // указание координат выстрела
        // проверка на попадание
        // подсчет результатов
        Shot shot;
        shot = new Shot(4,4);
        takeShot(field, shot);
        shot = new Shot(4, 6);
        takeShot(field, shot);
        shot = new Shot(4, 5);
        takeShot(field, shot);
        shot = new Shot(5, 7);
        takeShot(field, shot);
        shot = new Shot(4, 7);
        takeShot(field, shot);
    }

    private static void takeShot (Field field, Shot shot) {
        int l = shot.getCoords().getL();
        int d = shot.getCoords().getD();
        System.out.printf("Shot: %d, %d\n", l, d);
        if (field.matrix[d][l] == 1) { //hit
            field.matrix[d][l] = 3;

            if (ShipAliveChecker.check(field, shot.getCoords())) {
                System.out.println("Hit!"); // injury
            } else {
                System.out.println("Kill!"); } // death

        } else { // miss
            System.out.println("Miss!");
        }
        field.print();
    }
}

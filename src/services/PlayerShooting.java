package services;

import cycle.GameStep;
import domain.Command;
import fields.Field;

public class PlayerShooting{

    public void run(Field field, Command com) {
        int l = com.getShot().getCoords().getL();
        int d = com.getShot().getCoords().getD();
        System.out.printf("Shot: %d, %d\n", l, d);
        if (field.matrix[d][l] == 1) { //hit
            field.matrix[d][l] = 3;

            if (ShipAliveChecker.check(field, com.getShot().getCoords())) {
                System.out.println("Ранил"); // injury
            } else {
                System.out.println("Убил"); } // death
        } else { // miss
            System.out.println("Мимо");
            GameStep.isPlayerTurn = false;
        }
//        field.print();
    }
}

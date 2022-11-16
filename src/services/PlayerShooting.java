package services;

import cycle.GameStep;
import domain.Command;
import fields.Field;

public class PlayerShooting{

    public void run(Field field, Command com) {
        int l = com.getShot().getCoords().getL();
        int d = com.getShot().getCoords().getD();
        if (field.matrix[d][l] == 1) { //hit
            field.matrix[d][l] = 3;

            if (ShipAliveChecker.check(field, com.getShot().getCoords())) {
                System.out.println("Ранил\n"); // injury
            } else {
                System.out.println("Убил\n"); } // death
        } else { // miss
            System.out.println("Мимо\n");
            GameStep.isPlayerTurn = false;
        }
    }
}

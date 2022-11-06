package cycle;

import domain.Shot;
import fields.Field;
import services.PlayerCommand;
import services.ShipAliveChecker;

public class GameStep {

    public static void playerTurn(Field field) {
        PlayerCommand com = new PlayerCommand();
        Shot shot = new Shot(com.getCoords().getL(), com.getCoords().getD());
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

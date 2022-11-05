package services;

import fields.Field;
import ships.Ship;

public class ShipDeployer {


    /*
    Deploy ship on field.
     */
    public static void deploy(Field field, Ship ship) {
        for (int i = 0; i < ship.getSize(); i++) {
            field.matrix[ship.getBlockD(i)][ship.getBlockL(i)] = 1;
        }
    }
}

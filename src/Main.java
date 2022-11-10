import cycle.GameCycle;
import fields.Field;
import fields.FieldEnemy;
import fields.FieldOwn;
import ships.ShipPack;

public class Main {
    public static void main(String[] args) {
        Field myField = new FieldOwn();
//
        ShipPack myShipPack = new ShipPack();
        myShipPack.deployAllShips(myField);
//        ShipPack myShipPack = new ShipPack(myShip);
//        myShipPack.manualDeploy(myField, 4, 4, Direction.DOWN);
//        myField.print();
//
//        GameCycle.run(myField);

        Field enemyField = new FieldEnemy();
        enemyField.print();
        GameCycle.run(myField, enemyField);

    }
}
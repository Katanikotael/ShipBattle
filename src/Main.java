import fields.Field;
import fields.FieldOwn;
import ships.Ship;
import ships.ShipOne;
import ships.ShipTwo;

public class Main {
    public static void main(String[] args) {
        Field myField = new FieldOwn();
        Ship myShip1 = new ShipOne(1,3);
        Ship myShip2 = new ShipTwo(5,7);
        myField.deployShip(myShip1);
        myField.deployShip(myShip2);
        myField.print();
    }
}
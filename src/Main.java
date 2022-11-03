import fields.Field;
import fields.FieldOwn;
import services.NearPlaceCreator;
import services.ShipPlacer;
import ships.*;

public class Main {
    public static void main(String[] args) {
        Field myField = new FieldOwn();

        Ship fourBlockShipOne = new ShipFour();
        Ship threeBlockShipOne = new ShipThree();
        Ship threeBlockShipTwo = new ShipThree();
        Ship twoBlockShipOne = new ShipTwo();
        Ship twoBlockShipTwo = new ShipTwo();
        Ship twoBlockShipThree = new ShipTwo();
        Ship oneBlockShipOne = new ShipOne();
        Ship oneBlockShipTwo = new ShipOne();
        Ship oneBlockShipThree = new ShipOne();
        Ship oneBlockShipFour = new ShipOne();



        ShipPlacer.placeShip(myField, fourBlockShipOne);
        myField.deployShip(fourBlockShipOne);
        NearPlaceCreator.create(myField, fourBlockShipOne);

        ShipPlacer.placeShip(myField, threeBlockShipOne);
        myField.deployShip(threeBlockShipOne);
        NearPlaceCreator.create(myField, threeBlockShipOne);

        ShipPlacer.placeShip(myField, threeBlockShipTwo);
        myField.deployShip(threeBlockShipTwo);
        NearPlaceCreator.create(myField, threeBlockShipTwo);

        ShipPlacer.placeShip(myField, twoBlockShipOne);
        myField.deployShip(twoBlockShipOne);
        NearPlaceCreator.create(myField, twoBlockShipOne);

        ShipPlacer.placeShip(myField, twoBlockShipTwo);
        myField.deployShip(twoBlockShipTwo);
        NearPlaceCreator.create(myField, twoBlockShipTwo);

        ShipPlacer.placeShip(myField, twoBlockShipThree);
        myField.deployShip(twoBlockShipThree);
        NearPlaceCreator.create(myField, twoBlockShipThree);

        ShipPlacer.placeShip(myField, oneBlockShipOne);
        myField.deployShip(oneBlockShipOne);
        NearPlaceCreator.create(myField, oneBlockShipOne);

        ShipPlacer.placeShip(myField, oneBlockShipTwo);
        myField.deployShip(oneBlockShipTwo);
        NearPlaceCreator.create(myField, oneBlockShipTwo);

        ShipPlacer.placeShip(myField, oneBlockShipThree);
        myField.deployShip(oneBlockShipThree);
        NearPlaceCreator.create(myField, oneBlockShipThree);

        ShipPlacer.placeShip(myField, oneBlockShipFour);
        myField.deployShip(oneBlockShipFour);
        NearPlaceCreator.create(myField, oneBlockShipFour);

        myField.print();
    }
}
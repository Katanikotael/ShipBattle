package ships;

import fields.Field;
import services.NearPlaceCreator;
import services.ShipDeployer;
import services.ValidCoordinatesGenerator;

import java.util.ArrayList;

public class ShipPack {

    ArrayList<Ship> pack;

    public ShipPack() {
        this.pack = new ArrayList<>();
        pack.add(new ShipFour());
        pack.add(new ShipThree());
        pack.add(new ShipThree());
        pack.add(new ShipTwo());
        pack.add(new ShipTwo());
        pack.add(new ShipTwo());
        pack.add(new ShipOne());
        pack.add(new ShipOne());
        pack.add(new ShipOne());
        pack.add(new ShipOne());
    }

    /*
    Generate valid coordinates for ship.
    Deploy ships on the field.
    Mark tiles around ships.
     */
    public void deployAllShips(Field field) {
        for (Ship ship: this.pack) {
            ValidCoordinatesGenerator.generate(field, ship);
            ShipDeployer.deploy(field, ship);
            NearPlaceCreator.create(field, ship);
        }
    }
}

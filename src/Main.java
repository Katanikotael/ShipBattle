import cycle.GameCycle;
import cycle.GameStep;
import fields.Field;
import fields.FieldBot;
import fields.FieldPlayer;
import ships.ShipPack;

public class Main {
    public static void main(String[] args) {
        Field botField = new FieldBot();
        Field playerField = new FieldPlayer();

        ShipPack botShipPack = new ShipPack();
        botShipPack.deployAllShips(botField);

        GameStep.isPlayerTurn = true;

        GameCycle.run(botField, playerField);

    }
}
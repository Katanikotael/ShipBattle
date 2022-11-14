package domain;

import ships.Ship;
import ships.ShipDamaged;

import java.util.Scanner;

public class BotCommand extends Command {
    String command;
    Shot shot;
    public static Ship ship;
    public static Scanner sc = new Scanner(System.in);
    public static String answer = "нет";
    public static boolean isDamagedShip = false;
    public static ShipDamaged damagedShip;
    public static int dmgBlocks = 0;

    public BotCommand() {
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public static String getAnswer() {
        return answer;
    }

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}



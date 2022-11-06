package services;

import domain.Coordinates;

import java.util.Scanner;

public class PlayerCommand {

    Scanner sc;
    String command;
    Coordinates coords;

    public PlayerCommand() {
        this.sc = new Scanner(System.in);
        this.command = sc.nextLine();
        this.coords = CharTranslater.convert(command);
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Coordinates getCoords() {
        return coords;
    }

    public void setCoords(Coordinates coords) {
        this.coords = coords;
    }
}

package domain;

import services.CharTranslater;

import java.util.Scanner;

public class PlayerCommand extends Command {

    Scanner sc;
    String command;
//    Coordinates coords;
    Shot shot;

    public PlayerCommand() {
        this.sc = new Scanner(System.in);
        this.command = sc.nextLine();
//        this.coords = CharTranslater.convert(command);
        this.shot = new Shot(CharTranslater.convert(command));
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

    public Shot getShot() {
        return shot;
    }
}

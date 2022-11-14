package domain;

import java.util.Scanner;

public class PlayerCommand extends Command {

    Scanner sc;
    String command;
    Shot shot;

    public PlayerCommand() {
        this.sc = new Scanner(System.in);
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

    public void setShot(Shot shot) {
        this.shot = shot;
    }
}

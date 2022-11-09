package domain;

import java.util.Scanner;

public class BotCommand {
    String command;
    Coordinates coords;
    Scanner sc;
    String answer;

    public BotCommand() {
        this.sc = new Scanner(System.in);
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer() {
        this.answer = sc.nextLine().toLowerCase().strip();
    }
}

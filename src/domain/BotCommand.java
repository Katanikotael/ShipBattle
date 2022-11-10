package domain;

import java.util.Scanner;

public class BotCommand extends Command {
    String command;
    Shot shot;
    public static Scanner sc = new Scanner(System.in);
    public static String answer = "нет";

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

    public void setAnswer() {
        answer = sc.nextLine().toLowerCase().strip();
    }

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }
}



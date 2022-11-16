package services.rpsminigame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    public static boolean run() {
        ArrayList<String> answerArray = new ArrayList<>();
        answerArray.add("камень");
        answerArray.add("ножницы");
        answerArray.add("бумага");

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String playerAnswer = sc.nextLine().toLowerCase();
        String botAnswer = answerArray.get(rnd.nextInt(answerArray.size()));

        boolean isCheck = answerArray.contains(playerAnswer);
        while (!isCheck) {
            System.out.println("Напиши: камень, ножницы или бумага.");
            playerAnswer = sc.nextLine().toLowerCase();
            isCheck = answerArray.contains(playerAnswer);
        }

        while (playerAnswer.equals(botAnswer)) {
            System.out.printf("И у меня %s. Давай еще раз... Цу-Е-Фа...\n", botAnswer);
            playerAnswer = sc.nextLine().toLowerCase();
            isCheck = answerArray.contains(playerAnswer);
            while (!isCheck) {
                System.out.println("Напиши: камень, ножницы или бумага.");
                playerAnswer = sc.nextLine().toLowerCase();
                isCheck = answerArray.contains(playerAnswer);
            }
            botAnswer = answerArray.get(rnd.nextInt(answerArray.size()));
        }
        if (playerAnswer.equals("камень") && botAnswer.equals("ножницы") ||
            playerAnswer.equals("ножницы") && botAnswer.equals("бумага") ||
            playerAnswer.equals("бумага") && botAnswer.equals("камень")) {
            System.out.printf("У меня %s. Сначала ходишь ты.\n", botAnswer);
            return true;
        }
        System.out.printf("У меня %s. Сначала хожу я.\n", botAnswer);
        return false;
    }
}

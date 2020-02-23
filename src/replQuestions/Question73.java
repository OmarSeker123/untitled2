package replQuestions;

import java.util.Scanner;

public class Question73 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print Middle three characters");
        String word = scan.nextLine();

        int middleIndex = word.length() / 2;
        if (word.length() % 2 == 1 && word.length() >= 5) {

            System.out.println(word.substring(middleIndex - 1, middleIndex + 2));
        } else {
            System.out.println("invalid");

        }
    }
}
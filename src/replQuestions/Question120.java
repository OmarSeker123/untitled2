package replQuestions;

import java.util.Scanner;

public class Question120 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();

            String largest = words[0];

            for (int x = 0; x < words.length; x++) {
                if (largest.length() < words[x].length()) {
                    largest = words[x];
                }
            }
            System.out.println(largest);


        }
    }
}
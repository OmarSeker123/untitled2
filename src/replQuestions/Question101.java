package replQuestions;

import java.util.Scanner;

public class Question101 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countPython = 0;
        int countJava = 0;
        for (int i = 0; i < sentence.length() - 6; i++) {
            String current6Char = sentence.substring(i, i + 6);
            if (current6Char.equalsIgnoreCase("python")) {
                countPython++;
            }

        }
        for (int j = 0; j < sentence.length() - 4; j++) {
            String current4Char = sentence.substring(j, j + 4);
            if (current4Char.equalsIgnoreCase("java")) {
                countJava++;

        System.out.println(countJava == countPython);
    }
}}}
package replQuestions;

import java.util.Scanner;

public class Question110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        for (String eachWord : words ){

            String firstLast=""+eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1);
            System.out.println(firstLast);
        }
    }
    }

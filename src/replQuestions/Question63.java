package replQuestions;

import java.util.Scanner;

public class Question63 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Any word" );

        String word=scan.next();

        char first=word.charAt(0);

        System.out.println("first character of the word is : " + first);
    }
}

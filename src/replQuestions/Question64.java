package replQuestions;

import java.util.Scanner;

public class Question64 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word=scan.next();

        char lastC=word.charAt(word.length()-1);
        System.out.println(lastC);

    }
}

package replQuestions;

import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your name");
        String word=scan.next();

        char first=word.charAt(0);
        char last=word.charAt(word.length()-1);
        System.out.println(first+""+last);
    }
}

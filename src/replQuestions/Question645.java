package replQuestions;

import java.util.Scanner;

public class Question645 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word at least 3chars");
        String name = scan.nextLine();
        int charCount=name.length();

        System.out.println(" First Character " + name.charAt(0));
        System.out.println(" Last Character " + name.charAt(charCount-1));

        int middleIndex=(charCount-1)/2;
        System.out.println("Middle index " + name.charAt(middleIndex));
    }

}
package stringTasksPractice;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your word at least with 3 chars");

        String name=scan.nextLine();
        int charCount=name.length();

        System.out.println("First Character " + name.charAt(0));
        System.out.println("last Character " + name.charAt(charCount-1));

        int middleIndex=(charCount-1)/2;

        System.out.println("middle Index " +name.charAt( middleIndex));
    }
}

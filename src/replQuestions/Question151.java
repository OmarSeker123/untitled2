package replQuestions;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Question151 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number more than 10");


        int num = scan.nextInt();
        if (num < 10) {
            return;
        }
        System.out.println("HAPPY HOLIDAY");
        System.out.println("2 DAYS OFF !!  YAY");

    }


}
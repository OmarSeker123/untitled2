package replQuestions;

import java.util.Scanner;

public class Question107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num, digit1, digit2, digit3, digit4, digit5;
        num = scan.nextInt();

        digit1 = (num / 10000);
        System.out.println(digit1);
        digit2 = ((num % 10000)) / 1000;
        System.out.println(digit2);
        digit3 = ((num % 10000) % 1000) / 100;
        System.out.println(digit3);
        digit4 = (((num % 10000) % 1000) % 100)/10 ;
        System.out.println(digit4);
        digit5 = (((num % 10000) % 1000) % 100) % 10;
        System.out.println(digit5);

    }

}

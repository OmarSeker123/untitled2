package replQuestions;

import java.util.Scanner;

public class Repl20 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int hour=sc.nextInt();
        int minute=sc.nextInt();
        int second=sc.nextInt();
        String amOrPm=sc.next();

        System.out.println(hour+ ":" +minute + ":" + second+ amOrPm);
    }
}

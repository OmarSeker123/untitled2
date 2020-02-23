package replQuestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Status code");
        int status = scan.nextInt();

        switch (status) {
            case 404:
                System.out.println("Not Found");
                break;
            case 500:
                System.out.println("internal Server Error");
                break;
            case 2205:
                System.out.println("Invalid status code");
                break;
            default:
                System.out.println("THe End");
                break;

        }
    }
}






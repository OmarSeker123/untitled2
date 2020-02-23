package replQuestions;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println( "Enter month number:");
        int month=scan.nextInt();

        switch (month){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case  3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("The End");
                break;
    }

}
}

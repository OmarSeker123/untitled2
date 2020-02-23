package replQuestions;

import java.util.Scanner;

public class TernaryCondition {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments! ");
        System.out.println("Number of bedrooms your are interested :");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;
        int setStartingPrice1 = 1100;
        int setStartingPrice2 = 1850;
        int setStartingPrice3 = 2550;
        if (numberOfBedrooms == 1) {
            System.out.println("\"One bedroom Selected\"");
            System.out.println("set startingPrice as "  + setStartingPrice1);
        } else if (numberOfBedrooms == 2) {
            System.out.println("\"Two bedroom selected\"");
            System.out.println("set startingPrice as " + setStartingPrice2);
        } else if (numberOfBedrooms==3) {
            System.out.println("\"Three bedroom selected\"");
            System.out.println("set startingPrice as " +setStartingPrice3 );
        }else {
            System.out.println("\"No such Bedrooms available\"");

            System.out.println("\"Starting Price: value\"");
        }

    }
}



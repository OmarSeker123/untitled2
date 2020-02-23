package replQuestions;

import java.util.Scanner;

public class Question147 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String printSunset = "";
        String printEarth = "";
        String printDesert = "";
        if (number == 1) {
            System.out.println(printSunset);
        } else if (number == 2) {
            System.out.println(printEarth);
        } else if (number == 3) {
            System.out.println("print" +printDesert);
        }else{
            System.out.println("invalid");
        }

        }
    }


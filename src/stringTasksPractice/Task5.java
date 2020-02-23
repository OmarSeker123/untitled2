package stringTasksPractice;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name with prefix");

        String name = scan.nextLine();
        String upperCase = name.toUpperCase();
        if (upperCase.startsWith("DR")) {
            System.out.println("Doctor");
        } else if (upperCase.startsWith("MR")) {
            System.out.println("Male");
        } else if (upperCase.startsWith("MS")) {
        System.out.println("Single Female");

    }else if( upperCase.startsWith("MRS")) {
            System.out.println("Married Female");

        }else{
            System.out.println( " Invalid Entry");
        }
    }
}

package replQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InitialsExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the name with Prefix");
        String name = scan.nextLine();
        String upperCaseName = name.toUpperCase();
        if (upperCaseName.startsWith("DR")){;
        System.out.println("Doctor");
    }else if (upperCaseName.startsWith("MR")) {
            System.out.println(" Male");
        }else if (upperCaseName.startsWith("MISS")){
            System.out.println("Single Female");
        } else if (upperCaseName.startsWith("MRS")) {
            System.out.println("Married Female");
        }else{
            System.out.println("INVALID PREFIX");
        }

        }
}




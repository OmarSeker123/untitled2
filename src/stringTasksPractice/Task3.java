package stringTasksPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter your full name");
        String fullName=scan.nextLine();
       int lastNameInitialIndex= fullName.indexOf("") + 1 ;
     String initials= fullName.charAt(0)+ "" + fullName.charAt(lastNameInitialIndex);
        System.out.println(initials);
    }
}

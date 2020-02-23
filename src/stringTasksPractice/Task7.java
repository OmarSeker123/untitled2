package stringTasksPractice;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a valid email address :");
        
        String email=scan.next();
        
        int indexOfAtSign=email.indexOf("@");
        int indexOfDot=email.indexOf(".");
        
        String part1=email.substring(0,indexOfAtSign);
        System.out.println("part1 = " + part1);
String part2=email.substring(indexOfAtSign+1,indexOfDot);

        System.out.println("part2 = " + part2);
String part3= email.substring(indexOfDot+1);
        System.out.println("part3 = " + part3);

}
}

package stringTasksPractice;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
System.out.println("Enter your full Name");
String fullName= scan.nextLine();
int spaceIndex=fullName.indexOf(" ");

        System.out.println("spaceIndex = " + spaceIndex);
        String email=fullName.charAt(0) + fullName.substring(spaceIndex +1) + "@NightWatch.com";
        System.out.println("email = " + email);


    }
    
}
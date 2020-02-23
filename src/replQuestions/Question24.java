package replQuestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question24 {

    public static void main(String[] args) {
        System.out.println("Welcome to the patient portal");
        System.out.println("Please enter your personal information");
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter your first name");
        String firstName=scan.nextLine();
        System.out.println("Enter your last name");
        String lastName=scan.nextLine();
        System.out.println("Enter your email");
        String email=scan.next();
        System.out.println("Enter your street");
        String street=scan.nextLine();
        System.out.println("Enter your state");
        String state=scan.nextLine();
        System.out.println("Enter your city");
        String city=scan.nextLine();
        System.out.println("Enter your address");
        String address=scan.nextLine();
        System.out.println("Enter your contacts");
        String contacts=scan.next();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your zipcode");
        int zipCode=scan.nextInt();
        System.out.println("Are you married");
        boolean isMarried=scan.nextBoolean();
        isMarried=true;
        System.out.println("Enter your work phone number");
        long workPhoneNumber=scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalIphoneNumber=scan.nextLong();

    }
}

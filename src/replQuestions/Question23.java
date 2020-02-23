package replQuestions;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();
       int phoneNumber=areaCode+localNumber;
        System.out.println(" Calling number " + phoneNumber);
    }
}

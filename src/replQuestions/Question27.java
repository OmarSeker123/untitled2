package replQuestions;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println( "Welcome to the Grader!");

       String summary;
       double average;
     System.out.println("Please enter subject name number 1 and score for this subject");

     String subject1= "Math";

        System.out.println(subject1);
        double grade1= 5.0d;
        System.out.println(grade1);
        String subject2= "Biology";
     System.out.println("please enter");
        System.out.println(subject2);
        double grade2= 4.2d;
        System.out.println(grade2);
        String subject3= "English";
        System.out.println(subject3);
         double grade3= 4.4d;
        System.out.println( grade3);
        String subject4= "Chemistry";
        System.out.println(subject4);
        double grade4= 4.8d;
        System.out.println( grade4);
        String subject5= "Music";
        System.out.println(subject5);
        double grade5= 3.4d;
        System.out.println( grade5);
        summary= (subject1 + "-" + grade1) + " ," + (subject2 + "-"  + grade2)
        + ", "  +  (subject3 + "-" + grade3)+ " , " + (subject4 + "-"  + grade4) + "," + (subject5 + "-"  +grade5);
        System.out.print("  Summary : "  +  summary );

        average=(grade1+grade2+grade3+grade4+grade5)/5;
        System.out.println("");
        System.out.println("Your average score is : "  + average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
    }
}

package replQuestions;

import java.util.Scanner;

public class Question {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("in:");
        String name = inp.nextLine();

        if (name.equals("Chen")) {
            System.out.println("teacher");
        } else {
            System.out.println("Student");

        }
    }

}
package replQuestions;

import java.util.Scanner;

public class Question49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("PASSING / FAILING GRADE");
        int grade = s.nextInt();
        if (grade >= 90) {
            System.out.println("excellent");
        } else if (grade >= 70 && grade < 90) {
            System.out.println("good");
        } else if (grade > 60 && grade < 70) {
            System.out.println("pass");
        } else if (grade <= 60) {
            System.out.println("fail");
        }
    }
}



package replQuestions;

import java.util.Scanner;

public class Quesiton148 {
    public static void main(String[] args) {
  cube();

    }

    public static void cube() {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int cube = number * number * number;
        System.out.println(cube);
    }
}
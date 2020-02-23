package replQuestions;

import java.util.Scanner;

public class Repl15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i=scan.nextInt();
        float f= scan.nextFloat();

        System.out.println("i=" + i + " f=" + f );

    }

    public static class Repl13 {
        public static void main(String[] args) {

            String word= new Scanner(System.in) .nextLine();
            System.out.println("Today's Word-Of- The-Day is :" + word);
        }
    }
}

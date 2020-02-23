package replQuestions;

import java.util.Scanner;

public class Question95 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char start=scan.next().charAt(0);
        char end=scan.next().charAt(0)  ;
        for (char i = start; i <=end ; i++) {
            System.out.print(i + "");

        }

    }

    public static class Question96 {
        public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);
            String word=scan.next();
            String separator=scan.next();
            int count=scan.nextInt();

            for (int i = 1; i <=count ; i++) {
                if(i !=count){
                    System.out.print(word+separator);
                }else {
                    System.out.println(word);
                }

            }
        }
    }
}

package replQuestions;

import java.util.Scanner;
public class Question92 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();

int factorial=1;
int num=1;
        for (int i =1; i <num ; i++) {
            factorial+=factorial*i;
        }
        System.out.println(factorial);
        }


}

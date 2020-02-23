package replQuestions;

import java.util.Scanner;

public class Question118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();

            for (int x = 0; x <=3 ; x++) {
                System.out.println(arr[x]+" , " + arr[1]+" , " + arr[2]);


            }

        }
    }

}
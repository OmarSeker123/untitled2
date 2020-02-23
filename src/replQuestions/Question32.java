package replQuestions;

import java.util.Scanner;

public class Question32 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter seconds : ");
        int input=scan.nextInt();
        int hours=0;
        int minutes=0;
        int seconds=0;
        //Hours Conversion
        if((input/3600)!=0) {    // 1 hour =3600 seconds
            hours = input / 3600;
            input = input % 3600;
        } //Minute conversion


    }
}

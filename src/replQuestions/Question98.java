package replQuestions;

import java.util.Scanner;

public class Question98 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
            int count=0;
        for (int i = 0; i < str.length()-1; i++) {
        String currentChar=str.substring(i,i+2);
        if(currentChar.equalsIgnoreCase("hi")){
        count++;
        }

        }System.out.println(count);
        }
        }

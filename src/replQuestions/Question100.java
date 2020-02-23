package replQuestions;

import java.util.Scanner;

public class Question100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if(first == last){
            System.out.println("nothing");
        }else{

            String wordInBetween = str.substring(   first + 5 , last   );
            System.out.println(wordInBetween);
        }

    }
}
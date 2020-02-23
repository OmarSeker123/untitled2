package replQuestions;

import java.util.Scanner;

public class Question82 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String txt=s.next();
        char lastChar=txt.charAt(txt.length()-1);

        String txt2=txt.replace(lastChar, ' ');
        System.out.println(txt2);
    }
}

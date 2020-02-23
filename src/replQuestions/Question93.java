package replQuestions;
import java.util.Scanner;
public class Question93 {

    //Given a string word, print true if "java" appears starting at index 0
    // or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
    // The string may be any length, including 0word
    public static void main(String[] args) {

        boolean exist =false;
        Scanner scan= new Scanner(System.in);
        String word=scan.next();


        if(word.length()>=4 && word.substring(0,4).equals("java")) {
            System.out.println(" true");
        }else if(word.length()>=5 && word.substring(1,5).equals("java")) {
            System.out.println("true");
        }else  {
            System.out.println("false");


        }

    }


}

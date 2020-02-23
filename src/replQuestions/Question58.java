package replQuestions;
import java.util.Scanner;
public class Question58 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        String sentence=scan.nextLine();
        boolean wordContain=sentence.contains(word);
        System.out.println(wordContain);
    }

}

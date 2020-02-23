package replQuestions;

import java.util.Scanner;

public class Question102 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        //int doubleQuoteStarting=html.indexOf("id=")+4;
        //System.out.println(doubleQuoteStarting);
        String stringAfterDQ = html.substring(html.indexOf("id=") + 4);
        //System.out.println(stringAfterDQ);
        int lastIndexDQ = stringAfterDQ.indexOf("\"");

        if (html.contains("<html>")) {
            System.out.println(stringAfterDQ.substring(0, lastIndexDQ));
        } else {
            System.out.println("invalid input!");

        }
    }
}
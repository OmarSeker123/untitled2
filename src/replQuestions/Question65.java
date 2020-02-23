package replQuestions;

import java.util.Scanner;

public class Question65 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word1=scan.next();
        String word2=scan.next();

int firstPosition=word1.indexOf("");
String firstWord=word1.substring(0,firstPosition);
System.out.println(word1);
int secondPosition=word2.indexOf("");
String secondWord=word2.substring(word2.lastIndexOf("")+1);
System.out.println(word2);
System.out.println(word1+word2+(word2+word1));



    }
}

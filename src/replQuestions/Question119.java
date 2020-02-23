package replQuestions;

import java.util.Scanner;

public class Question119 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
          String email = input.nextLine();

          String[]arrEmail=email.split("@");
          if(arrEmail.length==2) {
              System.out.println("Email id: " + arrEmail[0]);
              System.out.println("Email domain:" + arrEmail[1]);
          }else {
              System.out.println("invalid email");
          }

    }
}

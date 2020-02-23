package replQuestions;

import java.util.Scanner;

public interface Question29 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double version= scanner.nextDouble();

        if(version==1.5) {
            System.out.println("Cupcake");
        }  else if (version==3.1) {
            System.out.println("Honeycomb");
        }else if (version>=4.1 && version<=4.31) {
            System.out.println("Jelly Bean");
        }   else if(version==9.0){
            System.out.println("Pie");
        }else{
            System.out.println("Sorry , I don't know this version !");

        }


    }
}






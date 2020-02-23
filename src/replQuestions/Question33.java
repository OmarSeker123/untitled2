package replQuestions;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int drinkCount=scan.nextInt();
        int drinkCountOverdose=10*1000/drinkCount;
        System.out.println(" it would take about " + drinkCountOverdose + " drinks for a lethal overdose ");


    }
}

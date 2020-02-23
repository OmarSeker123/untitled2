package replQuestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter item" + count + " and its price");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport += "item" + count + ":" + item + " price : " + price + " , ";
            count++;
            totalPrice += price;
            System.out.println(" Add one more item? ");
            countinue = scan.next();

        }while(countinue.equalsIgnoreCase("yes") && count<=10);
        shoppingListReport=shoppingListReport.substring(0,shoppingListReport.length()-2);
        System.out.println(" total price: " + totalPrice);



        }


}

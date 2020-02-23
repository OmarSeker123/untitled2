package replQuestions;

import java.util.Scanner;

public class question34 {
    public static void main(String[] args) {


        int itemPrice,quarters,dimes,nickels,change;
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter price in cents :");
        itemPrice=scan.nextInt();

        if(itemPrice%5!=0 || itemPrice<25 || itemPrice>100) {
            System.out.println("Invalid price!");
        }else {
            change=100-itemPrice;
            quarters=change/25;
            dimes=(change%25)/10;
            nickels=((change%25)%10)/5;
            System.out.println( " Your change is " + quarters+ " quarters " + dimes + " dimes and "
            +nickels + " nickels ");
        }
    }
}

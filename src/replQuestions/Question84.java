package replQuestions;

import java.util.Scanner;

public class Question84 {

    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        if (isPremiumCustomer) {
            if (nbooksPurchased >= 8) {
                freeBooks = 2;
            } else if (isPremiumCustomer) {
                if (nbooksPurchased >= 5) {
                    freeBooks = 1;
                } else if (nbooksPurchased >=12){
                    freeBooks = 2;
                }else if (nbooksPurchased >= 7) {
                    freeBooks = 1;

                }
            }
        }
        System.out.println(freeBooks);
    }
}


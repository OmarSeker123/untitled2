package replQuestions;

import java.util.Scanner;

public class Question35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();
        int usbCable = 10;
        int pillow = 40;
        int blanket = 60;
        int socks = 5;
        int hat = 25;
        int pants = 50;
        int headPhones = 30;
        int charger = 15;
        int lapTop = 400;
        int smartPhone = 300;
        int giftCard = 100;
        if (item.equalsIgnoreCase("Pillow")) {
            System.out.println("Thank you for your purchase!\n Your balance is : " + (giftCard - pillow));
        } else if (item.equalsIgnoreCase("Blanket")) {
            System.out.println("Thank you for your purchase ! \n Your balance is : " + (giftCard - blanket));
        } else if (item.equalsIgnoreCase("Charger")) {
            System.out.println("Thank you for your purchase ! \n  Your balance is : " + (giftCard - charger));
        } else if (item.equalsIgnoreCase("USB cable")) {
            System.out.println("Thank you for your purchase !\n Your balance is : " + (giftCard - usbCable));
        } else if (item.equalsIgnoreCase("Headphones")) {
            System.out.println("Thank you for your purchase ! \n Your balance is : " + (giftCard - headPhones));
        } else if (item.equalsIgnoreCase("Pants")) {
            System.out.println("Thank you for your purchase ! \n Your balance is : " + (giftCard - pants));
        } else if (item.equalsIgnoreCase("Hat")) {
            System.out.println("Thank you for your purchase ! \n Your balance is : " + (giftCard - hat));
        } else if (item.equalsIgnoreCase("Socks")) {
            System.out.println("Thank you for your purchase ! \n Your balance is :" + (giftCard - socks));
        } else if (item.equalsIgnoreCase("Laptop")) {
            System.out.println(" Sorry,not enough funds on your gift card ! ");
        } else if (item.equalsIgnoreCase("SmartPhone")) {
            System.out.println("Sorry , not enough funds on your gift card ! ");

        } else {
            System.out.println(" Invalid item ! ");


        }
    }
}
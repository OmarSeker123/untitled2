package day27;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

    public static void main(String[] args) {


        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {


            System.out.println("Enter  an int number :");
            int input = scan.nextInt();
            numbers[i] = input;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
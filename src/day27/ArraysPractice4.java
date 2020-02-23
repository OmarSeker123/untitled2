package day27;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice4 {


    public static void main(String[] args) {
        int num=10;
        int[]arr={10,20,30,40,50,60};

        int num1=arr[arr.length-1];
        System.out.println(num1);

        System.out.println("---------=============>");

        //expected 10 20 30 40 50 60

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i] +  " ");

            System.out.println("\n===============");

            //Arrays to String (VariableName):

            String str=Arrays.toString(arr);

            System.out.println(str);

           // Task01

            //write a program that asks user to enter a number 5 times, and store those into array

            int[]numbers=new int[5];
            Scanner scan=new Scanner(System.in);

            for (int j = 0; j <5 ; j++) {
                System.out.println(" Enter an int number ;");

                int input=scan.nextInt();// return int data type
                numbers[i]=scan.nextInt();

                System.out.println(Arrays.toString(numbers));

                // Arrays.sort(variableName) sorts the array in ascending order

                Arrays.sort(numbers);
                int largestNumber=numbers[numbers.length-1];
                int minNumber=numbers[0];

                System.out.println("largest number is"+ largestNumber);
                System.out.println("Minimum number is " + minNumber);

            }

        }
    }
}

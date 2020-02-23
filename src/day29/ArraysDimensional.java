package day29;
import java.util.Arrays;
public class ArraysDimensional {

    public static void main(String[] args) {

        // create and array wit size 100 and fill it up

        // \n Escape sequence  will move it to next Line

        int [] numbers= new int[100];
        System.out.println("Before filling up\n" +Arrays.toString(numbers));

      //  numbers[0]=1;
    //    numbers[1]=2;
    //    numbers[2]=3;

      // ********
   // numbers[99]=100;



        for (int x = 0; x <numbers.length ; x++) {

            numbers[x]= x+1;



        }

        System.out.println("After filling up\n" +Arrays.toString(numbers));
    }


}

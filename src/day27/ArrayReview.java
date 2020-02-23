package day27;
import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class ArrayReview {
    public static void main(String[] args) {

    //    Decleration:

      //  data-Type[]

        //Array  a variable that allows us to store multiple values. Regular variables can only
        // store only store one single values  int a=10;

// array must convert to string in order to be printed

        //array variables
      //  int[] arr={1,2,3};

        int num=10;
        int[] arr= {10,20,30,40,50,60};

      //  int num1=arr[arr.length];
        int num1=arr[arr.length-1];
        //6
        System.out.println(num1);
        System.out.println("===============");        // expected result is 10 20 30 40 50 60

        for(int x=0;  x<=arr.length-1 ;  x++){

            System.out.println(arr[x]);
            System.out.print(arr[x] + "");


            //Arrays.toString(varibale name)

            String str= Arrays.toString(arr);
            System.out.println(str);

            Arrays.toString(arr);
            System.out.println(arr);
        }

    }




}

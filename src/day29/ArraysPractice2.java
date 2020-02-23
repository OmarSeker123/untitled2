package day29;
import java.util.Arrays;
public class ArraysPractice2 {


    public static void main(String[] args) {

        // fill up this array with even number starting from 0



        int[]numbers=new int[100];

        numbers[0]=0;  //0*2
        numbers[1]=2;    //  1x2
        numbers[2]=4;// 2x2
        numbers[3]=6; // 3x2
        numbers[4]=8;  // 4x2
        numbers[5]=10; //5x2

        //******
        numbers[99]=198;  //99*2


        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i*2;



        }

  // numbers[x] =x*2

        System.out.println(Arrays.toString(numbers));

    }
}

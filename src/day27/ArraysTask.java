package day27;
import java.util.Arrays;

public class ArraysTask {

    public static void main(String[] args) {

        //write a program that can find the minimum number from an array'
        // do not use sort method

        int[]scores={100,897,654,32,1231,224,556,7,1,2,3,4};

        int min=99999;

        for (int i = 0; i < scores.length; i++) {
             if(min>scores[i]){

                 min=scores[i];
             }


            System.out.println("minimum number " + min);
        }
    }
}

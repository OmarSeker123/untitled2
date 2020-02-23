package day27;
import java.util.Arrays;
public class ArrayTask2 {

    public static void main(String[] args) {

        //write a program that can find the minimum number for an array DO NOT USE sort method

        //write a program that can find the second minimum number for an array DO NOT USE sort
        //method
        //write a program than can find the third minimum number for an array DO NOT USE SORT

        int[]scores={100,-99,-1000,2000,5000,0,1,2000};

        int min=scores[0];

        for (int i = 0; i < scores.length; i++) {

            if (min > scores[i]) {
                min = scores[i];

            }
        }
        System.out.println("minimum number is" + min);


         int secondMin= scores[0];
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i]==min){
                continue;
            }
            if(secondMin>scores[i]){
                secondMin=scores[i];
            }
        }
        System.out.println("secon minimum number is ;" + secondMin);
                }
            }




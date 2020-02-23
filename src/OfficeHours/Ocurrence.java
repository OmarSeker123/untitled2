package OfficeHours;
import java.util.Arrays;
public class Ocurrence {

    public static void main(String[] args) {
        // write a program that can print unique from an String Array
        String []array={"A","A","B","C","C"};// expectd result is B

        int count2=0 ;// to store the number

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(array[1])){
                count2++;

                if(count2==1){
                    System.out.println(array[3]);
            }

        }

            }

        }

    }


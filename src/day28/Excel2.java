package day28;

import java.util.Arrays;

public class Excel2 {

    public static void main(String[] args) {

        int[][] myExcel = {

                {10,27,88,99}, //index 0 : this is first 1 d array
                {87,100},   //   index  1 :this is second 1d array
                {90, 45, 65 } // index  2 :   this is third 1d array

                };
            // this is the ending 2d array object
        System.out.println(Arrays.deepToString(myExcel));
// what does deepToString method do:

        // it takes an multiD array and turn it into a string with all times

        // what external data do we provide
        // the multiD array object or the multiD array variable
        //what do I get out of it

        // ______> String representation of  multiD array object

        for ( int[] eachRow  :  myExcel) {

            for(  int eachCell   : eachRow    ){


                System.out.print( eachCell + " ");


            }
            System.out.println();
        }
        }
    }

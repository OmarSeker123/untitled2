package day27;
import java.util.Arrays;
public class MultiArray {

    public static void main(String[] args) {

        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15}};
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {// check each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) {// check each elements in the single dimensional

                if (max < numbers[i][j]) {
                    max = numbers[i][j];

                    System.out.println("=================");

                 String[]   developersTeam= {"Vladislav" , "Hasan","Tolkun","Abide"};
                 String[] testerTeam={"Zhibekchach", "Mohammed Sohrabi" ,"Nursultan"};
                String []businessAnalysitTeam={"Lisa", "Ersha" , "Naila"};




                }

            }
        }
        System.out.println(max);

        //solution2:

        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers) {  //variable eah1DArray represents each single

            for (int eachInt : each1DArray) {

                if (max2 < eachInt) {
                    max2 = eachInt;
                    System.out.println(max2);
                }
            }
        }


        int min = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (min > numbers[i][j]) {
                    min = numbers[i][j];

                    System.out.println(min);


                }
            }

        }

    }}



package day26;
import java.util.Arrays;
public class ArrayPractise {

    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 187, 87, 110};
   String finalResult = "";
int cntlessThan100=0;
        int count = 0;

        for (int eachNum : scores) {
            if (eachNum <= 100) {

                System.out.println("eachNum" + eachNum);
count++;

                System.out.println("Count = " + count);

                if(count>0) {

                    finalResult = "No";
                }else {

                    finalResult="Yes";


                    int cntMoreThan=0;


                }
            }
        }
    }}
package day29;
import java.util.Arrays;
public class ArraysPractice4 {

    public static void main(String[] args) {
        
        String[] strArr = new String[300];
         
      strArr[0]   =" I love java"  ;
      strArr[1] = "I love java";
      strArr[2]= " I love java";

        for (int i = 0; i <strArr.length;i++){
            strArr[i]= (i+1)+  ".I love java";

            System.out.println("strArr=" + Arrays.toString(strArr));
        }
        }
    }


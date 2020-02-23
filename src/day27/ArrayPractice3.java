package day27;
import java.util.Arrays;
public class ArrayPractice3 {

    public static void main(String[] args) {

        int[]myNumbers=new int[]{5,3,21,2,1,13,8};
        int size=myNumbers.length;
        int lastIndex =size-1;



        System.out.println(Arrays.toString(myNumbers));
// first and last
        System.out.println(myNumbers[0] +  "---" + myNumbers[lastIndex - 0]);
      // second and one before last
        System.out.println(myNumbers[1]+ "----"+ myNumbers[lastIndex-1]) ;

        System.out.println(myNumbers[2]+  "---" + myNumbers[lastIndex -2]);
    }
}

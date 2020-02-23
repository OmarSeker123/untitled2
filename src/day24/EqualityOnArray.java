package day24;
import java.util.Arrays;
public class EqualityOnArray {
    public static void main(String[] args) {

        int[] scores1= {2,5,6,7,3,34,6};
        int[] scores2= {22,45,6,37,3,6,9};
        int[]scores3= {2,5,6,7,3,34,6};

        System.out.println(    scores1==scores2);
        System.out.println(     scores1==scores3);

        boolean is1s2Equals=Arrays.equals(scores1,scores2);
boolean isS1S3Equals= Arrays.equals(scores1,scores3);
    }
}

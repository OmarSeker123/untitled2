package day24;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int[]scores = {99,44,66,23,19,55};

        System.out.println( Arrays.toString (scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        char[] nameChars={'G','A','D','Z','Z','C','A'};
Arrays.sort(nameChars);
        System.out.println( "after sorting nameChars= ="  + Arrays.toString( nameChars));

       // Boolean Array did not exit

        boolean[]fiveSwitchOnOff= {true,false,true, true };
        System.out.println( "fiveSwitchOnOff="  + Arrays.toString(fiveSwitchOnOff));

    }
}

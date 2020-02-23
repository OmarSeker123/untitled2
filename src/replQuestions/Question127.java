package replQuestions;
import java.util.*;
public class Question127 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();

        }


        int maxValueIndex = 0;

        for (int i = 0; i < inhabitants.length; i++) {
            if (inhabitants[i] > inhabitants[maxValueIndex]) {

                maxValueIndex = i;
            }
        }
        for (int i = 0; inhabitants[maxValueIndex] != 0; i++) {
            for (int y = 0; y < inhabitants.length; y++) {
                inhabitants[y] = inhabitants[y] / 2;
            }

            System.out.println(" Day" + i + " " + Arrays.toString(inhabitants));


        }
    }}











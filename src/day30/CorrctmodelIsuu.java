package day30;
import java.util.Arrays;
public class CorrctmodelIsuu {

    public static void main(String[] args) {

        String sentence ="I love Java Java Java";

        String[]wordArray= sentence.split(" ",7);

        System.out.println("wordsArray=" + Arrays.toString(wordArray));
        System.out.println("wordsArray size=" +wordArray.length);

    }
}

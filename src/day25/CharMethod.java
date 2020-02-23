package day25;
import java.util.Arrays;
public class CharMethod {

    public static void main(String[] args) {

        String name = "Anastasiya";
        char[] allcharsInName= name.toCharArray();

         for(char eachCHar  :  allcharsInName){
             System.out.println( "eachChar ="  +  eachCHar);

              int count=0;
                      for (char eachChar  :  allcharsInName) {
                          if (eachCHar == 'a') {

                              ++count;

                              //

                              Arrays.sort(allcharsInName);

                              System.out.println( "after sorting" + Arrays.toString(allcharsInName));
                          }
                      }}}}



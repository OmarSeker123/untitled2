package day63;
import java.util.*;
public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str= "AAABBBBBBCCRDD";

        //GET THE FREQUENCY AND STORE INTO MAP <CHARACTER,INTEGER>
        Map<Character, Integer>charFreq=new HashMap<>();
        
        for(int x=0 ; x<str.length();x++){
            
            char currentChar=str.charAt(x);
            if(! charFreq.containsKey(str.charAt(x))) {
                System.out.println("Enter for the first time" + str.charAt(x));
                charFreq.put(str.charAt(x), 1);
            }else {
                charFreq.replace(currentChar,charFreq.get(currentChar)+1);
                
            }
            
        }
        System.out.println("charFreq = " + charFreq);
    }

}

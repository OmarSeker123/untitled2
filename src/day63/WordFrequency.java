package day63;
import java.util.*;
public class WordFrequency {

    public static void main(String[] args) {

        String str= "Finding word Frequecny Sounds Fun, Because Fun COmes in When you count Words" +
                " Do it and find out , Words Words, Words,";

        //int wordCount=str.split(" ").length;
        String[]allWords=str.split(" ");
        System.out.println("words.length =" + allWords.length);

        //we want to solve this using the Map
        //because Map only can have unique key , so we can use it for unique words
        //first create Map object HashMap implementation

        //loop through the word array
        //check if we already have the word in the key or not
        //if we do not have the key , it means we are entering for the first time
        //so  the count will be 1, add using put method
        //elsi it means we already have it in the key
        //so we get existing count using that key
        //and replace the old count value with new count value by incrementing by1


        Map<String,Double>wordFreMap=new HashMap<>();

        for(String currentWord:allWords){
            if(wordFreMap.containsKey(currentWord) ==false ) {

            }else{
               int newCount= (int) (wordFreMap.get(currentWord) +1);
               // wordFreMap.replace(currentWord,newCount);
                wordFreMap.replace(currentWord,wordFreMap.get(currentWord)+1);
        }
    }
        System.out.println("wordFreMap =" + wordFreMap);
    }}

package day63;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
//CREATING  HASHMAP OBJECTS

        // Compared to List, set which store single element per item
        // Map Store Key-value pair per item
        // That's why we need to data type inside<>
        //one for the key one for the value
        Map<String ,String > nameAndStatePair=new HashMap<>();

        Map<Integer, String>groupNmuLeaderNamePair=new HashMap<>();
        Map<Integer,Double>groceryNameAndPricePair=new HashMap<>();
        Map<String, Boolean>voterAndEligibilityPair=new HashMap<>();
        Map<String , Integer>gameNameAndScoreMap=new HashMap<>();
        Map<Byte,Character>questionNumAndCorrectAnswerPair=new HashMap<>();


    }
}

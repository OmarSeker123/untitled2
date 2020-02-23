package day64;

import java.util.*;

public class MapKeySetView_MapIteration {

    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Grape", 1.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.99);

        System.out.println("groceryPriceMap.get (\"Apple\") = " + groceryPriceMap.get("Apple"));

        // Map is not iterable so we can not directly iterate over them
        // we can get something iterable out of the map
        //for example keySEt view will return a SEt<String> and it's iterable
        
        
        Set<String>allNames=groceryPriceMap.keySet();
        
        for(String eachName : allNames){

            System.out.println("eachName = " + eachName);

            System.out.println("| value is "  + groceryPriceMap.get(eachName));

           // System.out.println("groceryPriceMap.get (\"Apple\") = " + groceryPriceMap.get("Apple"));
        }
        
        
    }
}

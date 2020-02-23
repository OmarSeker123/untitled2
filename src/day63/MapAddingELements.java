package day63;
import java.util.*;
public class MapAddingELements {
    public static void main(String[] args) {

        Map<String,Integer>nameAgePair=new HashMap<>();

        // adding elements :put



        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muhammad",21);
        nameAgePair.put("Maila",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Fatih",27);
        nameAgePair.put("Roksana " , 16);
        nameAgePair.put("Zehra",7);

        System.out.println("namedAgePair= "  + nameAgePair);
        //getting the size of a map

        System.out.println("nameAgePair.size =" + nameAgePair.size());

        // how do we get an value according  to the key

        System.out.println("nameAgePair.get =" + nameAgePair.get ("Maila"));
        System.out.println("Zehra's age =" + nameAgePair.get ("Zehra"));

        // how do I check a key already exist or not

        System.out.println("nameAgePair.containsKey (\"Roksana\"=" + nameAgePair.containsKey("Roksana"));

   // how do i only add new items if ti doesn't already exist
        nameAgePair.putIfAbsent("Zehra",10);

        // UPDATING THE ELEMENT  IN THE MAP USING REPLACE

        nameAgePair.replace("Maila",17);

// updating the value only if the old value equals to a specified value

        nameAgePair.replace("Zehra",7,9);
        //System.out.println(nameAgePair.get("Zehra"));
        System.out.println("nameAgePair.get (\"Zehra\") = " + nameAgePair.get("Zehra"));

        nameAgePair.remove("Fatih");
        System.out.println("nameAgePair.get(\"Fatih\")=" +nameAgePair.get("Fatih"));
        System.out.println("nameAgePair.containsKey(\"Fatih\") = "  + nameAgePair.containsKey("Fatih"));


    }
}

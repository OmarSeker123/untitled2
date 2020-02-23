package day64;
import javax.lang.model.SourceVersion;
import java.util.*;
public class MapKeysSetView {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Grape", 1.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.99);
// map view
        //keySet view, values view, entrySet view
        // how do I store all the keys into a Collection?
        //what do you think the data will be to store such collection?
        //Set because keys are unique
        
        // we cans use keySet() method of Map to get Set of Keys
        // this Set is strictly connected to thru original map
        //if you remove  an item, map entry with this key will be also removed

        Set<String> allNames = groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);

        allNames.remove("Tomato");
        System.out.println("allNames no tomato = " + allNames);

        System.out.println("groceryPriceMap after =" + groceryPriceMap);
//WHAT IF WE DO NOT WANT SUCH REALATIONSHIP AND WE JUST WANT TO USE THE KEYS SOMEWHERE ELSE?
        // GET A COPY OF THE SET into different object

        Set<String>namesCopy=new HashSet<>(allNames);
        System.out.println("namesCopy = " + namesCopy);
        namesCopy.remove("Tomato");
        System.out.println("groceryPriceMap =" +groceryPriceMap);
    }
}
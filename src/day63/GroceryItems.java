package day63;
import java.util.*;
public class GroceryItems {


    public static void main(String[] args) {


        Map<String, Double> groceryList = new Hashtable<>();

        groceryList.put("tomato", 0.99);
        groceryList.put("fetaCheese", 6.99);
        groceryList.put("potato", 1.09);
        ;
        groceryList.put("apple", 0.99);
        groceryList.put("orange", 1.29);
        groceryList.put("banana", 0.49);
        groceryList.put("apple", 0.99);
        groceryList.putIfAbsent("Fish", 12.99);
        groceryList.putIfAbsent("apple", 2.99);

        System.out.println("Grocery List= " + groceryList.size());
        System.out.println("Grocery List=" + groceryList);
        System.out.println("GroceryLIst.get(\"tomato\") = " + groceryList.get("tomato"));
        //   groceryList.replace("Apple",0.99*2);
        //  System.out.println("groceryList.get(\"apple\")=" +groceryList.get("apple")*2);

        double newPrice = groceryList.get("apple") * 2;
        groceryList.replace("apple", newPrice);
        System.out.println("apple new price =" + newPrice);

        if (groceryList.containsKey("tomato")) {
            groceryList.remove("tomato");
            System.out.println("NO MORE TOMATO");
        }
        System.out.println("grocery list =" + groceryList);
        }
    }

package day63;
import java.util.*;
public class CharCountPair {

    public static void main(String[] args) {
        /*
        * Abraham Hope
2	Zeliha Sezer
3	Onuralp Dursun
4	Tugba Bekar
5	Birnigar Ozyurt
6	Seda Civan
7	Nuran Demir
8	Murat Kilinc
9	Hakan Durmus
10	Mariia Lukianenko
         */

List<String>names=new ArrayList<>();

names.add("Abraham Hope");
        names.add("Abraham Hope");
        names.add("Zeliha Sezer");
        names.add("Tugba Bekar");
        names.add("Birnigar Ozyurt");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Murat Kilinc");
        names.add("Hakan Durmus");
        names.add("Nuran Demir");
        names.add("Mariia Lukianenko");
        
        Map<String,Integer>nameCharCountPair=new HashMap<>();

        for (String eachMember :names) {
            nameCharCountPair.put(eachMember,eachMember.length());

        }
        System.out.println("nameCharCountPair = " + nameCharCountPair);
    }
    
 
    
    
}

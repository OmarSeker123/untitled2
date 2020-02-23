package DAY31;

public class StaticMethod {

    public static void main(String[] args) {
//reversePrintMyOwnName();
    }
    /* reversePrintMyOwnName
    * create a method that has no parameter and print your name in reversed order
    *
     */
public static void  reversePrintMyOwnName(){

    String name="Akbar";
    //start from last character and print toward first character

    for (int i =  name.length()-1 ; i >=0 ; i--) {

        System.out.println( name.charAt(i));


    }

    }
}

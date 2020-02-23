package stringTasksPractice;

public class Practice {

    public static void main(String[] args) {

       String name="j";
       if(name.length()>2) {
           ;
           System.out.println(name.substring(0, 2));
       }  else if( name.isEmpty()) {
           System.out.println(" Empty string");
       } else{
           System.out.println(name.charAt(0)+"" +name.charAt(0));
       }
    }
}
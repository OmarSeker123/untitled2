package day35;

public class CharacterPractice2 {
    public static void main(String[] args) {

       char myChar='7';
       //get int 7
      int myNum=  Integer.parseInt("");
        System.out.println("myNum = " + myNum);
        //Character.toString(myChar)   one option
       
       //String.valueOf(myChar)  another option


        String str = "A34B123C4X";

        char[] allChars = str.toCharArray();

       int sum=0;
       
        for (char each : allChars) {
            if (Character.isDigit(each)) {
                System.out.println("each = " + each);
                int eachNum=Integer.parseInt(each+"");
                
            }
        }
    }
}


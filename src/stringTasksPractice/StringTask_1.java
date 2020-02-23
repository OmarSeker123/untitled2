package stringTasksPractice;

public class StringTask_1 {
    public static void main(String[] args) {

        String name = "j";

        if (name.length() > 2) {
        System.out.println(name.substring(0, 2));
    }else if(name.isEmpty()) {
            System.out.println("Empty String");
        }else {
            System.out.println(name.charAt(0)+""+name.charAt(0)+""+ name.charAt(0));
        }

        }


}

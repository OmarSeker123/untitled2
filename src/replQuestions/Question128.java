package replQuestions;
import javax.swing.*;
import java.util.*;
public class Question128 {
    public static boolean same(String str1, String str2) {

  str1=new TreeSet<String>(Arrays.asList(str1.split(""))).toString();

  str2=new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

  return str1.equals(str2);

    }

}

package day25;
import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import  java.util.Arrays;
public class StringToChar {
  public static void main(String[] args) {
        String myName = "OMER";
char[] nameChar=myName.toCharArray();
        System.out.println(Arrays.toString(nameChar));
    }
}

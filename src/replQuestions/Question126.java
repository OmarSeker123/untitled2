package replQuestions;
import day22.Array;

import  java.util.*;


public class Question126 {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        System.out.println(str);
        String[] ar = str.split(",");
        System.out.println(Arrays.toString(ar));

        String sh  = new String();
        int a = 10;
        String sh1 [] = new String[]{};

        for(int i =0; i < ar.length ; i++){
            if(ar[i].length()-1 < a){
                sh = ar[i];
                a =ar[i].length()-1;
        }else if(ar[i].length()-1 == a){
                sh = sh+","+ar[i];
            }
    }        System.out.println(sh);
        String [] ar2 = sh.split(",");
        Arrays.sort(ar2);
        Arrays.sort(sh1);

        System.out.println(Arrays.toString(ar2));

        String t1 = "";
        for(int i =0 ; i< ar2.length ; i++){
            t1 = t1+","+ ar2[i];
        }
        String [] ar3 = t1.split(",");
        System.out.println(Arrays.toString(ar3));
    }}
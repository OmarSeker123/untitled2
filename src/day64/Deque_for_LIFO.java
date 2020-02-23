package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        // how do we implement a LIFoQUeue if not using old class called Stack
        //we can use any of Deque interfacer implementation
        //Deque is a double ended queue so we can add item as always

        //and  when we remove we can  use removeLast method to achieve last in FIrs out



        Deque<String>lifoQue=new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend he class");
        lifoQue.add("Say bye to java");


        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());
        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());
        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());
        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());





    }
}

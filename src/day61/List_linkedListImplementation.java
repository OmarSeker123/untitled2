package day61;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_linkedListImplementation {

    public static void main(String[] args) {

    //    List<String> lst=new ArrayList<>();

        List<String>lst=new LinkedList<>();

        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Kamira");
        lst.add("Sabira");

        System.out.println("lst" + lst);;
        lst.remove("Ershat");
        System.out.println("lst = " + lst);

         // Linked  List vs  ArrayList

        // getting random item by index
          //ArrayList is better

        // adding removing item  LinkedList is better

       // ArrayList is backed by array
//  LinkedList is backed by Node

        //Node: an object thant contains value plus the pointer to its neighbor


       // Big O Notation    . this is  a way programmers describe
        // the performance of an algorithm time complexity

        //O(1) means the more elements you have in the list
  }// it does not change the performance

// O (N)  means the more  elements you have in the list , it takes more time performance Wise




}

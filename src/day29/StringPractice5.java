package day29;

import java.util.Arrays;

public class StringPractice5 {

    public static void main(String[] arg){

        String  hero1= "Superman- J  Clark Kent";


        // the initial of  the Hero is CK

        //logic 1 :split this by dash-to get 2 pieces of String array
        // to get 2 pieces of  String into a String array

        String[]heroSplitted=hero1.split("-");

        System.out.println(" heroSplitted=" + Arrays.toString(heroSplitted));

        String heroCode=heroSplitted[0];
        String fullName= heroSplitted[1];

        // hero code is Superman and Identity is Clark Kent  method one

        //System.out.println("Hero code is " + heroSplitted[0] +  " and identity is " + heroSplitted[1]) ;               ;

        System.out.println("Hero code is " + heroCode + "and identity is " + fullName);


        // the initial of the Hero is CK
        // I can just use fullName variable to finish this task

        // LOGIC1:get first letter always  of fullName
        // then get the letter after the space
        //concatenate them
        // downside is what if we have middle name
        // solution, instead of looking for the letter after first space
        // look for last index of the space then get next character


       // LOGIC  2 ; WE already have full name stored in fullName variable
        // split by space   we will get firstName(middle name) lastName
        //then get the last name using last item index
        // get the first character then concatenate them
        // Clark Kent --.> [ clark  , Kent ]  Clark---C  Kent K ----CK



        String[]fullNameSplitted=fullName.split(" ");

        System.out.println("fullNameSplitted=" + Arrays.toString(fullNameSplitted));

// last name will be always the last element of splitted full name
        //no matter the name has middle or not

        String lastName=fullNameSplitted [fullNameSplitted.length-1 ];

        System.out.println("lastName=" + lastName);

        System.out.println("initial of the hero is :" + fullName.charAt(0)+ lastName.charAt(0));


    }
}


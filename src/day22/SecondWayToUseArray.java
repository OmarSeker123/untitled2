package day22;

import javax.lang.model.SourceVersion;

public class SecondWayToUseArray {

    public static void main(String[] args) {

        int num;
        num=10;

        int[]ages=new int[]{ 3,5,11,33,57,18};

        int itemCount=ages.length;
        System.out.println("itemCount="+ itemCount);
        System.out.println("ages = " + ages);
        for (int x = 0; x < itemCount; x++) {
            System.out.println(ages[x]);


    }}
}

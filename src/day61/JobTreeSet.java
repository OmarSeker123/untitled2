package day61;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        // make a SortedSet of Job (from day 61 ) with TreeSet implementation
        // ad 5 jobs and print them out vertically and see what you get.

        SortedSet<Integer>myJobs=new TreeSet<>();

        myJobs.add(200000);
        myJobs.add(150000);
        myJobs.add(120000);
        myJobs.add(95000);
        myJobs.add(325000);
        System.out.print("myJobs = " + myJobs);
        System.out.print("myJob first  = " +  myJobs);

for (Integer each : myJobs){
    System.out.println("each = " + each);
}


    }


}

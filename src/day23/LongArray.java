package day23;

public class LongArray {

    public static void main(String[] args) {
       long[] salaries = new long[]{100000l, 200000l, 150000, 115000l, 60000l};
        for (long eachSalary : salaries) {
           // System.out.println("eachSalary = " + eachSalary);
        }
        for (long salary : salaries) {
            if (salary > 100000) {
                //System.out.println("salary = " + salary);
                if (salary<=100000){
                    continue;
                }
                System.out.println("salary = " + salary);
        }

    }}}

        



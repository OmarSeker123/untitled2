package day23;

public class FindMax {

    public static void main(String[] args) {
        long[]salaries=new long[]{ 100000l,200000l,150000l,115000l,60000};

        long maxSalary=salaries[4];

        for(long salary : salaries){
            if(salary>maxSalary){
                maxSalary = salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);
    }
}

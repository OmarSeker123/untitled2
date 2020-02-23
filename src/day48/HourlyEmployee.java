package day48;

public class HourlyEmployee extends Employee{

    double  hourlyWage;
    int numberOfHours;

    public HourlyEmployee(String name,int id,double hourlyWage,int numberOfHours) {

        super(name,id);
        this.hourlyWage=hourlyWage;
         this.numberOfHours=numberOfHours;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Hourly Employee yearl:" + hourlyWage*numberOfHours);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numberOfHours=" + numberOfHours +
                ", name='" + name + '\'' +
                '}';
    }


}


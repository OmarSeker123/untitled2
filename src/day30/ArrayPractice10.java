package day30;
import java.util.Arrays;
public class ArrayPractice10 {

    public static void main(String[] args) {

        String[] cars = {"Acura-NSX",

                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        //task1: count Chevrolet and civic
        // we can use contains, startwith, endwith to get some result
        int chevyCnt = 0;
        int civicCnt = 0;

        for (String eachCar : cars) {

            if (eachCar.toLowerCase().startsWith("chevrolet")) {
                chevyCnt++;
            }

            if(eachCar.toUpperCase().contains("CIVIC")){
                civicCnt++;
            }
        }
        System.out.println("chevrolet = " + chevyCnt);
        System.out.println("civicCnt = " + civicCnt);
    }
}

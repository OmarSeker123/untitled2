package day46;
//Programmer as super class
// JavaProgrammer
// unique behavior :drinkCoffee, doRepl, doJavaDevelopment
//sql Programmer


public class Programmer{

    void code() {

        System.out.println("any programmer code");

    }

    // is private method inherited ? NO!!
    // SO IT CAN NOT BE OVERRIDDIN
//     private void test(){
    void test() {

        System.out.println("any programmer test");

    }


}
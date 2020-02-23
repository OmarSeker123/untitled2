package day32;

public class MethodWithRetrunInfo {

    public static void main(String[] args) {

    String name =    giveMeMyName();
        System.out.println("name = " + name);
        
        int myResult=doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        // Systme.out.println(Arrays.toString(arrayObjectHere));
        //just like we can directly use the toString mehtod above and print the value
        // we can print the result of a method call directly, if he method return a value
        System.out.println(" result of doubling 100 is " + doubleTheNumber(100));

   int add14to16Result=add2Numbers(14,16);
        System.out.println("add14to16Result = " + add14to16Result);

    }
    // create a method called add  , accpet 2 int paramater
    // and return the result as int

    public static int  add2Numbers ( int num1 , int num2)  {
        // int sum= num1+num2
        //return sum;
        return  num1+num2 ;



    }





    //doubleTheNumber
    // create a static method that double the value of a number
    // it accpet one int parameter and return doubled value that number
    // whole purpose of writing a method that return a value
    // so can save the result after calling the method
    // and use it somehwere else
    public static  int doubleTheNumber(int num) {
        System.out.println("I am going to double the value of " + num);
        int result=num*2;
        return result;
        
    }

// i want to create a method called giveMeMyName
    // create a static method it return you name as a result
    // it has no parameters
    
    public static String  giveMeMyName() {
        
        
       

    return  "Akbar" ;
    
    
    }


}

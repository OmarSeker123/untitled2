package day48;



    // We build relationship between class and interface
    // using implements keyword (compared to extends keyword for class  to class
    // we can say plane is a Flyable
    // since we are inheriting abstract method


import org.w3c.dom.ls.LSOutput;

public class Plane implements Flyable {

        int capacity;
        String name;
        int speed;


        @Override
        public void fly() {
            System.out.println("Plane is flying ");
        }

        // bad idea but just demo purpose

        public static void main(String[] args) {


            Plane p1 = new Plane();
            p1.fly();
            System.out.println( Flyable.HAVE_WING);
        }

    }




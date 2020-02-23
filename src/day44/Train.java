package day44;

// what is inherited from Super class

//fields and methods that visible to the  sub class are inherited

//constructors are not inherited


public class Train extends  Vehicle {

   // String  make ;
 //   int year;


int wagonCount;
public void makeChoChoSound() {
    System.out.println("CHOOOCHOO");
}

    public static void main(String[] args) {


    Train t1=new Train();
    t1.makeChoChoSound();
 // these attributes we got from vehicle
    t1.make="Thomas";
   // t1.year=199;
  //  calling the method we got from vehicle

        t1.start();
        t1.goForward();





    }


            }





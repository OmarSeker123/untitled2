package day40;

public class HotMarketAction3 {

    public static void main(String[] args) {
    Offer o1 =new Offer();
        o1.company="Apple";
        o1.location="Austin";
        o1.isFullTime=false;
        o1.salary=140000;


        o1.turnToFullTime();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayInformation();

        o1.changeAllInfo("Amazon", "Virginia", 150000L, true);
o1.displayInformation();
   // if this guy earn more than 100k
        // move him to Atlanta
        System.out.println("is it 100k Offer?" + o1.is100KOffer());
  //      boolean result=o1.is00KOffer();
 //       if(result==true){

        if(o1.is100KOffer()) {
            o1.changeLocation("Atlanta");

        }

    o1.displayInformation();

    }
}

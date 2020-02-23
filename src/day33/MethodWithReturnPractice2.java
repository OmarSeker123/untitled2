package day33;

public class MethodWithReturnPractice2 {

    public static void main(String[] args) {
       // convertNumberToDay
      //  this method will take number from 1 -7
      //  convert to actual day
      //  @param intDayCode
      //  return the day in word in English as String
      //  if number valid
      //  if number is not 1-7 return Funday!
       //         */
       // convertNumberToDay(5);
    }
    public static String getDaysOfTheWeekFromNumber (int dayCode){
        String dayName="";
        switch(dayCode){
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="Tuesday";                break;
            case 3:
                 dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
               dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
               dayName="Sunday";
                break;
            default:
                dayName="Funday";
        }
        return dayName;
    }
}

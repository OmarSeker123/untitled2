package day29;

public class HeroIdentity {

    public static void main(String[] args) {

        String hero1= "Superman -Clark J Kent";

        // hide this hero identity

        //string heroX= "Superman"***********";

        //  given a String with hero code and name separated by
        // turn this String into hero code and * with same length as hero name

        //Plain English Logic:

        // split it by - to get the code and full name
        // get the length of full name
        //generate stars with same length as full name character count
        // concatenate heroCode with dash and stars and save it
        // Or one the star is generated, replace full name with stars


        String[]heroSplitted = hero1.split(" - ");
        String heroCode=heroSplitted[0];
        String fullName= heroSplitted[1];

        int nameCharCount= fullName.length();
        String stars= "";

        for (int i = 0; i < nameCharCount; i++) {

            stars=stars+"*";  // starts = "*

            System.out.println(fullName);
            System.out.println(stars);

        }


    }
}

package day27;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
public class MulitDimensional2 {

    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitTeam = {"Lisa", "Ersha", "Naila"};

        String[][] scrumTeam = {developersTeam, testerTeam, businessAnalysitTeam};

        int maxlength = scrumTeam[0][0].length();
        for (String[] each1DArray : scrumTeam) {

            for (String eachElement : each1DArray) {
                if (maxlength < eachElement.length()) {
                    maxlength = eachElement.length();


                    System.out.println(eachElement);
                }
            }
        }}}







package replQuestions;

import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter current count SeniorCitizens and nonSeniorCitizens:");
        int  seniorCitizens=scan.nextInt();
        int nonSeniorCitizens=scan.nextInt();
        System.out.println("What is new citizen's age ?" );
        int citizenAge=scan.nextInt();

        if(citizenAge>=65) {
            seniorCitizens++;
            System.out.println("Senior Citizen");
        }else if(citizenAge<65) {
            nonSeniorCitizens++;
            System.out.println("Non-Senior Citizen");

        }
        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);





        }
    }


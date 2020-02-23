package OfficeHours;

import java.util.Scanner;

public class StudyTIme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
   String smallest=str[0];
        for (int i = 0; i <str.length ; i++) {
            if((smallest.length())>str[i].length()) {
                smallest = str[i];
            }
        }
        System.out.println(smallest);
    }
}
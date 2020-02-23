package replQuestions;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("in:");
        int num=inp.nextInt();
        if(num%2==0) {
            System.out.println(num + " is even");
        }  if(num%2==1){
            System.out.println(num+ " is odd");
            }

}}
package day26;
import java.util.Arrays;
public class ArraysContinue {

    public static void main(String[] args) {

        String name1= "Emma";
        String name2= "jason";
        String tempContainer=name1;//Emma

        name1=name2;// name1--->jason
        name2=tempContainer;// name2---> emma

        int[]myNumber=new int[]{10,40,30,7};






        int temp=myNumber[0];

        myNumber[0]=myNumber[3]; //first item value become7
        myNumber[3]=temp;

        System.out.println("first item = " + myNumber[0]);
        System.out.println("last item = " + myNumber[3]);
        System.out.println("mynumbers =" + Arrays.toString(myNumber));

    }






}

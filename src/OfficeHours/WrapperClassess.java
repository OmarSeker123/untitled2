package OfficeHours;

public class WrapperClassess {
    public static void main(String[] args) {

        Double num1=0.5;
        Short num3= 45;
        Integer num4=100;

        double num2=num4;
        System.out.println(num2);


        String str3="FalSE";

      boolean r2=  Boolean.parseBoolean(str3);
        System.out.println(r2);


        Long number1=100L;// Auto

        Float f1=100.0f;

        double d1=f1;// unboxing

        System.out.println(Byte.MAX_VALUE);// maximum value of byte primitive
        System.out.println( Byte.MIN_VALUE);// Minimum value of primitve Byte

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    // parse methods: converting String values to primitives

        // ValueOF Methods: converting

//parse methods
        String str1= "123";
        System.out.println(str1+1);
  int result =Integer.parseInt(str1);
        System.out.println(result+1);

        String str2 ="true";
   boolean r1= Boolean.parseBoolean(str2);
        System.out.println(r1);



        String str4="Parvin";
     boolean r3= Boolean.parseBoolean(str4);
        System.out.println(r3);

        //Value of mehods convertin


        String s1="100.5";
  Double c1  = Double.parseDouble(s1);//auto boxing
        System.out.println(c1+1);
Double c2=Double.valueOf(s1);

        System.out.println(c2);

        String s2="TruE";  // NOT CASE SENSETIVE

        Boolean b1= Boolean.valueOf(s2);
        System.out.println(b1);

    }

}

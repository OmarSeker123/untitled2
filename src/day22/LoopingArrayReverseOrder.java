package day22;

public class LoopingArrayReverseOrder {

    public static void main(String[] args) {

        int[]scores=new int[4];

        scores[0]=95;
        scores[1]=95;
        scores[2]=95;
        scores[3]=95;
        int elementCount =scores.length;
        int lastItemIndex= elementCount-1;

        for (int x = lastItemIndex; x >=0 ; x++) {
            System.out.println( "index location" +x);
            System.out.println(scores[x]);

        }

    }






}

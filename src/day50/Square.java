package day50;

public class Square extends  Shape {

     int length;
public Square(String name,int length){
    super(name);//reusing functionality of super class
    this.length=length;
}

    @Override
    public void calculateArea() {
        are= length*length;
    }

    @Override
    public void draw() {

        System.out.println( "Draw 4 equal line with 90 degree lenght " +length);

    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", are=" + are +
                '}';
    }
}

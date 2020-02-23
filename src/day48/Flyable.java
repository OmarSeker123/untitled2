package day48;

public interface Flyable {
    // this how we create interface
    // interface is abstract  type just like abstract class
    //no object can be created from it
    //it provide guideline for implementing classes
    //it's like signing a contract

    // an interface can only have public final field
    public static final Boolean HAVE_WING= true;

    // can we have constructor  ?  ABSOLUTELY NO!!!!!

    public abstract void fly();
}

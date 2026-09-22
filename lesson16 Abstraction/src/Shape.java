public abstract class Shape { //we can't create objects as it is abstract
    abstract double area(); //abstract method

    //Abstract classes should not have public constructors. Constructors of
    //abstract classes can only be called in constructors of their subclasses.
    //So there is no point in making them public. The protected modifier
    //should be enough.

    void message(){ //CONCRETE METHOD which is inherited to children classes from Shape(parent) class
        System.out.println("This is the Area");
    }
}

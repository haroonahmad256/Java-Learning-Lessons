public class Abstraction {
    /*Abstraction: Used to define abstract classes and methods
    * Abstraction is the process of hiding implementation details of classes and methods
    * and showing only the essential features;
    * Abstract classes can't be instantiated directly means object of abstract classes can't be created directly
    * Can contain 'abstract' methods (which must be implemented by its children)
    * Can contain 'concrete' methods (which are inherited) */

    //Shape shape= new Shape(); we can't create directly any shape object because
    //This class is declared as abstract class. We want user to create a certain type of shape which is available
    public static void main(String[] args){
        Circle circle= new Circle(4);
        Triangle triangle= new Triangle(8,7);
        Rectangle rectangle = new Rectangle(9,2);
        // Abstract classes can contain abstract methods(which must be implemented by its children)
        // and also contain concrete methods
        // it means declaring methods in parent class and implementing them in children classes

        //RUN TIME Polymorphism: using reference of other class and creating object of other class
        Shape shape;
        shape= new Triangle(2,5);
        shape=new Circle(6);
        shape=new Rectangle(3,7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        circle.message();
        shape.message();
    }


}

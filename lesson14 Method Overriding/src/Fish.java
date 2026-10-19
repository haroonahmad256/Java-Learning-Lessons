public class Fish extends Animal{
    //now for this class we want to change move method from running to swimming so
    @Override
    void move(){
        System.out.println("This animal is swimming"); //we have given specific implementation for this method
                                                       //for this class
    }
}

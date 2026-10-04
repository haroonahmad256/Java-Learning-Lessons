public class GetterSetter {
    public static void main(String[] args){
        // They help to protect object data and rules for accessing and modifying them.
        // GETTERS = Methods that make a field Readable
        // SETTERS = Methods that make a field Writable
        Car car= new Car("Lambo", "Yellow", 10000);
        //and if we want to make changes:
        car.setModel("BMW");
        car.setPrice(-1100);
        System.out.println(car.getModel()+" "+car.getColor()+" "+car.getPrice()); //in this way we can read them by calling functions

    }
}

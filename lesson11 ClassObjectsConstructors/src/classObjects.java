public class classObjects {
    public static void main(String[] args){
        /*Object: An entity that holds data (attributes)
         and can perform actions (methods)
         It is a reference data type
         we store the data for an object in location named as heap*/

        Car car= new Car(); //this is to create object from the class which we created named as car
        System.out.println(car); //since car is object which is a reference data type so it will give
                                 //memory address of the object we created
        car.name= "Audi";
        car.model= "A4";
        car.year= "2025";
        car.price= 10000;
        System.out.println(car.name);
        System.out.println(car.model);

        car.model();
        car.brake();
    }
}

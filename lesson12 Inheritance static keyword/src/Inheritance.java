public class Inheritance {
    public static void main(String[] args){
        //inheritance: One class inherits the attributes and method
        //             from another class
        //             Child <- Parent

        Cat cat= new Cat("Small", "More cute");
        System.out.println(cat.isAlive);
        cat.eat();
        cat.mew();

        Dog dog= new Dog(4, "Medium");
        System.out.println(dog.legs);
        System.out.println(dog.size);
        dog.eat();
        dog.bark();

        Plant plant= new Plant();
        System.out.println(plant.growFactor);
        System.out.println(plant.isAlive);
        plant.sun();
        plant.org();
    }
}

public class Cat extends Animal {
    String size;
    String cuteness;
    Cat(String size, String cuteness){
        this.size= size;
        this.cuteness= cuteness;
    }
    void catEat(){
        System.out.println("Cat drinks milk");
    }
    void mew(){
        System.out.println("Cat do meow meow");
    }

}

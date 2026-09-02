public class Dog extends Animal {
    int legs= 4;
    String size;
    Dog(int legs, String size){
        this.size = size;
        this.legs= legs;
    }
    void eat(){
        System.out.println("Dogs eats meat");
    }
    void bark(){
        System.out.println("Dogs bark bow bow");
    }

}

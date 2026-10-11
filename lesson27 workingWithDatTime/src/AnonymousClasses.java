public class AnonymousClasses {
    public static void main(String[] args){
        //Anonymous classes: That doesn't have a name and they can't be reused
        //                   Add custom behavior without creating new class
        //                   Often used for One time taks

        Dog dog1= new Dog();
        Dog cat= new Dog(){
            @Override
            void speak(){
                System.out.println("The cat goes meow");
            }
        };
        dog1.speak();
        cat.speak();
    }
}

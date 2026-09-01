import java.util.ArrayList;
public class Generics {
    public static void main(String[] args){
        //Generic = A concept where you can write a class, interface, or method
        //          that is compatible with different data types.
        //          <T> type parameter (placeholder that gets replaced with a real type)
        //          <String> type argument (specifies the type)

        //ArrayList<String> fruits= new ArrayList<>(); String is also generic data type
        //fruits.add("Apple");
        //fruits.add("Banana");
        //fruits.add("Mango");

        Box<String> box1= new Box<>(); //Now in box class where we used T as data type,
        //typeArgument                 // String will be replaced and will be used as data type
                                      //our box class is compatible with different data types
        box1.setItem("Hello world suck off");
        System.out.println(box1.getItem());

        Product<String, Integer> product1= new Product<>("Blanket", 1000);
        product1.setItem("Fuck you nothing changes do only code");
        product1.setPrice(9000);    //Hey bro it more than your auqaat
        System.out.println(product1.item+" "+ product1.price);
    }
}

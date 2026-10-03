public class Car {
    private String model;
    private String color;
    private int price;
    //Access modifiers:
    //Public:
    //When we write public then it means the method or class can be accessed from anywhere and anyone can access it
    //Private:
    //When we wri```te private then it means that method can be only accessible in that specific class
    //Default:
    //And when we don't write anything with class or method it means that the method is accessible in that
    //package only in which it is created not in whole program and packages
    //Protected:
    //When we write this access modifier it means that it is not only accessible in only that packages but also in other
    //packages but only on those other packages which are extending the class in which that protected method is written


    Car(String model, String color, int price){
        this.model= model;
        this.color= color;
        this.price= price;
    }

    String getModel(){
        return model;
    }

    String getColor(){
        return color;
    }

    int getPrice(){
        return price;
    }

    void setModel(String model){
        this.model= model;
    }

    void setPrice(int price){
        if(price<0){
            System.out.println("Price can't be less than 0");
        }
        else{
            this.price= price;
        }

    }
}

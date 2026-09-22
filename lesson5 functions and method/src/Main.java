//In programming we follow D.R.Y process which is (Don't Repeat Yourself)
public class Main {
    static void greet() {
        System.out.println("Hello Java");
    }

    static void add(int a, int b){
        System.out.println(a+b);
    }
    //overloaded function are the functions with same name but different parameter
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    static int minus(int a, int b){
        return a-b;
    }
    //There are two types of functions which are called methods in java.
    //1. Static methods/ functions      2.Nonstatic methods/ functions
    //Static are those which are directly executed without creating any object. They belong
    //to a class and can be called without any object

    //Nonstatic belongs to an object and require an object. The reason is that nonstatic methods can't be run
    //without objects as static keyword tell JVM to execute the method without creating object

    void display() { // this is a nonstatic method. To use it we have to create an object
        System.out.println("Non-static method");
    }

    int multiply(int number1, int number2){
        return number1*number2;
    }

    //Main:
    public static void main(String[] args){
        //Static:
        greet();
        add(3,8);
        add(7,4,2);
        System.out.println(minus(0, 9));
        int arr[]= {1,2,3,4};
        printArray(arr);
        //Nonstatic:
        Main dis= new Main();
        dis.display();
        Main mul= new Main(); //have to create object
        System.out.println(mul.multiply(6, 9));
        //These nonstatic methods are specially for OOP
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

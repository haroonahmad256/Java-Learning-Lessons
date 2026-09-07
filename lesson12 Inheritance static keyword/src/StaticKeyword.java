public class StaticKeyword {
    public static void main(String[] args){
        // static: makes a variable or method belong to the class
        //         rather than to any specific object
        //         Commonly used for utility methods or shared resources.

        //         static is used to make any method executable without creating any object and method
        //         can be called without creating any object.

        //         Utility methods in Java are static methods that perform common, reusable functions
        //         without needing an instance of the class.

        Friends friends= new Friends("Haroon");
        Friends friends1= new Friends("Ahsan");
        Friends friends2= new Friends("Bilal");

        System.out.println(Friends.numOfFriends);

        Friends.showFriends();

        //accessing these static methods and variable by name of class is just like math class which is also accessed by name of class
        Math.round(7.2399999999999);
    }
}

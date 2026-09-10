public class Constructors {
    public static void main(String[] args){
        // constructors: A special method of initialize objects without creating variables
        // you can pass arguments to a constructor and setup initial value
        Students students1= new Students("Haroon", "25011519-033", 3.88, 19);
        System.out.println(students1.name+" "+students1.rN+" "+ students1.grade+" "+students1.age);

        Students students2= new Students("Ameer", "25011519-009", 3.76, 18);
        System.out.println(students2.name+" "+students2.rN+" "+ students2.grade+" "+students2.age);
    }
}

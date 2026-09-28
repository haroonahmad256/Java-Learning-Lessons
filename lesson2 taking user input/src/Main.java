import java.sql.SQLOutput;
import java.util.Scanner;
// Here we imported a package with help of which we can take input from user in java.
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name= scanner.nextLine();
        System.out.println("Enter your age: ");
        int age= scanner.nextInt();
        System.out.println("Enter your Gpa: ");
        float gpa= scanner.nextFloat();
        System.out.println(("Are you a student: "));
        boolean isStudent= scanner.nextBoolean();

        System.out.println("Hello my name is "+ name);
        System.out.println("My age is "+ age + " years old");
        System.out.println("My gpa is "+ gpa + " points");
        System.out.println("Am i student:  "+ isStudent);
        if (isStudent){
            System.out.println("You are enrolled as student");
        }
        else{
            System.out.println("You are not enrolled");
        }

        //separated
        System.out.println("Enter you class: ");
        int clas= scanner.nextInt();
        // One way to clear input buffer is to get rid of that new line character \n to do this
        scanner.nextLine();
        System.out.println("Enter you favourite colour: ");
        String color= scanner.nextLine();   // it is possible that when we took integer input and hit enter due to buffer \n will be left and
                                            // this string color input would take take \n as input and we would not be able to input color by
                                            // ourselves because it has taken \n which was left as buffer when we took integer input. And this problem is
                                            // usually in java where \n of previous input value interrupt input of next variable. This is called input buffer
        System.out.println("My class is "+ clas);
        System.out.println("My favourite color is "+ color);

        // Java supports formatted output (like printf in C).
        int x = 10;
        double y = 3.14159;
        System.out.printf("x = %d, y = %.2f", x, y); //formatted string
        scanner.close();
    }
}
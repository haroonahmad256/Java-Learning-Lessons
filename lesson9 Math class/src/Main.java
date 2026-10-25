import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double power;
        power= Math.pow(2, 3);
        System.out.println(power);

        power= Math.abs(-3.99); //this method gives positive number if negative is given
        System.out.println(power);

        power= Math.sqrt(9);
        System.out.println(power);

        power= Math.round(3.45);    //It will give 3.0
        System.out.println(power);

        power= Math.ceil(3.45);  //It will give 4.0
        power= Math.floor(3.99); //It will give 3.0

        power= Math.max(8,5);
        power= Math.min(2,9);
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter side A of triangle: ");
        double a= scanner.nextDouble();
        System.out.print("Enter side B of triangle: ");
        double b= scanner.nextDouble();

        double c;
        double product= Math.pow(a,2) + Math.pow(b, 2);
        c= Math.sqrt(product);
        System.out.printf("The circumeference of triangle: %.2fcm\n", c);
        scanner.close();
        //formatted print
        double n= 9.342;
        double n2= 4000000;
        double n3= -32.5;
        System.out.printf("%f\n", n);
        System.out.printf("%,f\n", n2); //by adding ,(comma) befoe f will make digit containing ,(comma) after every 3 digits
        System.out.printf("%(.2f\n", n3); // '(' before the 'f' will make the negative numbers enclosed within brackets
        System.out.printf("% .2f\n", n3); //space before 'f' will make negative number negatively signed and positive number spaced

        int a1= 1;
        int a2= 12;
        int a3= 123;
        int a4= 1234;
        System.out.printf("%04d\n", a1); //This will adjust the number to align with respect to other number output: 0001
        System.out.printf("%04d\n", a2);    //output: 0012
        System.out.printf("%04d\n", a3);    //0123
        System.out.printf("%04d\n", a4);    //1234

        System.out.printf("%4d\n", a1); //this will arrange them without adding zero in right side
        System.out.printf("%4d\n", a2);
        System.out.printf("%4d\n", a3);
        System.out.printf("%4d\n", a4);

        //current case me agar tu hmara digit 4 digits ka hai tu wo use as it is likh de ga aur agar number 4 digits ka nhi hai
        //tu ye function use arrange kr de ga is tarah k chaar digit ki space add kre ga

        System.out.printf("%-4d\n", a1); //this will arrange them without adding zero in left side
        System.out.printf("%-4d\n", a2);
        System.out.printf("%-4d\n", a3);
        System.out.printf("%-4d\n", a4);
    }
}

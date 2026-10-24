import java.util.Scanner;
public class Enums {
    public static void main(String[] args){
        //Enums = (Enumerations) A special kind of class that
        //        represents a fixed set of constants.
        //        They improve code readability and are easy to maintain
        //        More efficient with switches when comparing Strings.
        try{
            String inputDay;
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter a week day name: ");
            inputDay= scanner.nextLine().toUpperCase();
            Days day= Days.valueOf(inputDay);
            System.out.println(day);

            switch (day){
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY -> System.out.println("It is a week day");
                case SATURDAY, SUNDAY -> System.out.println("It is weekend day");
                default -> System.out.println("INVALID");
            }
            scanner.close();
        }

        catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day name");
        }

    }
}

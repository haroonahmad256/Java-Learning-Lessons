import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("Watermelon");
        fruits.add("APple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.remove(0);
        fruits.set(2, "Grapes"); //to update certain element of arraylist

        System.out.println(fruits.get(2)); //to print certain element of arraylist
        System.out.println(fruits.size()); //size of the arraylist
        Collections.sort(fruits); //sort all the elements of arraylist

        for (String fruit: fruits){
            System.out.println(fruit);
        }

        int n;
        String fruity;
        ArrayList<String> foods= new ArrayList<>();
        System.out.print("How many foods you want to add: ");
        Scanner scanner= new Scanner(System.in);
        n= scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<n; i++){
            System.out.print("Enter fruit name to add: ");
            fruity= scanner.nextLine();
            foods.add(fruity);
        }
        System.out.println(foods);
    }
}

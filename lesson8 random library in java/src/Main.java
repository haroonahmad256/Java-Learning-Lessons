import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random random= new Random();

        int randomNumber= random.nextInt(); //This will generate a random number but it will generate a very large random number
        int number= random.nextInt(1,6); //this will give random number between 1 and 5 including 1 and 5 excluding 6
        System.out.println(number);

        //we can also generate double random numbers
        double fnumber= random.nextDouble(2,4); //if we don't write anything inside nextdouble it would give fractional numbers between 0 and 1
        System.out.println(fnumber);

        //Booleans can also be generated with random this is useful when we have to make program of flip coin
        boolean isHeads= random.nextBoolean();
        System.out.println(isHeads);//good for heads or tail

        if (isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

        
    }
}

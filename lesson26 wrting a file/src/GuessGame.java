import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args){
        /*
        * input
        * empty array or string in which we will store each single charater added
        * agar character correct howa to wo array me shaamil hoga warna ni hoga
        * random class ka use kr k hum aik word choose krein ge aur wo words aik file me pare hon ga
        * */

        Scanner scanner= new Scanner(System.in);
        char[] randomWord= randomWord().toCharArray();

        char[] replacingWord = new char[randomWord.length];
        for (int i=0; i<randomWord.length; i++){
            replacingWord[i]= '_';
        }
        int successfulAttempts=0;
        int unsuccessfulAttempts=0;
        boolean shouldGO= true;

        while(!(Arrays.equals(randomWord, replacingWord))){
            System.out.println("You have "+(3-unsuccessfulAttempts)+" attempts left");
            System.out.println("Current Guess condition: ");
            for (int i=0; i<randomWord.length; i++){
                System.out.print(replacingWord[i]);
            }
            System.out.println();
            System.out.print("Guess a character: ");
            char inputCharacter= scanner.next().charAt(0);

            boolean access= false;
            for (int i=0; i<randomWord.length; i++){
                if (inputCharacter== randomWord[i]){
                    replacingWord[i] = inputCharacter;
                    access=true;
                }
            }
            if (access){
                System.out.println("Correct!");
                successfulAttempts++;
            }
            else{
                System.out.println("Incorrect!");
                unsuccessfulAttempts++;
                System.out.println(wrongGuess(unsuccessfulAttempts));
                if (unsuccessfulAttempts==3){
                    System.out.println("You have reached your attempts limit!");
                    break;
                }
            }
        }
        if ((Arrays.equals(randomWord, replacingWord))){
            System.out.println("Congratulation you have Guess the name: "+Arrays.toString(replacingWord)+" in "+ successfulAttempts+" successful attempts and in "+ unsuccessfulAttempts+" unsuccessful attempts");
        }
        else{
            System.out.println("You couldn't Guess the name: "+Arrays.toString(replacingWord)+" in "+ successfulAttempts+" successful attempts and in "+ unsuccessfulAttempts+" unsuccessful attempts");
        }
    }

    static String wrongGuess(int wrongattempts){
        String pattern1= """
                 o
                /""";
        String pattern2= """
                 o
                /|""";
        String pattern3= """
                 o
                /|\\""";

        String toreturn= switch (wrongattempts){
            case 1 -> pattern1;
            case 2 -> pattern2;
            case 3 -> pattern3;
            default -> "Invalid";
        };
        return (toreturn);
    }

    static String randomWord(){
        String line;
        String[] arr= new String[11];
        try(BufferedReader reader= new BufferedReader(new FileReader("Words.txt"));){
            int i=0;
            while((line= (reader.readLine()))!= null){
                arr[i]= line;
                i++;
            }

        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

        Random random= new Random();
        String randomChoiceInFileWords= arr[random.nextInt(arr.length)];
        return randomChoiceInFileWords;
    }
}

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
public class writeFile {
    public static void main(String[] args){
        String message;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a message: ");
        message= scanner.nextLine();
        try{
            FileWriter writer= new FileWriter("FirstFile.csv", true);
            writer.write(message+"\n");
            System.out.println("File has been written");
            writer.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Couldn't locate your file location");
        }
        catch(IOException e){
            System.out.println("Couldn't write the file");
        }
    }
}

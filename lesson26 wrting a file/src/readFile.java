import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args){
        //Reading a file:
        //BufferedReader + FileReader = Best for reading text files line by line. It acts like a middle man between program and file system
        //(for reading with efficiency) + (for actual reading)
        //FileInputStream: Best for binary files (e.g., images, audio files)
        //RandomAccessFile: Best for write/read specific portion of a large file

        try(BufferedReader reader= new BufferedReader(new FileReader("FirstFile.csv"))){ //when we use fileIO like this we don't need to close the file manually
            String line;
            while((line= reader.readLine())!=null){ //readLine method reads the line and assign it to line variable and when lines runs
                                                    //out in file readLine method gives null value
                System.out.println(line);
            }
            System.out.println("File is readed successfully");
        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't locate the file");
        }
        catch (IOException e){
            System.out.println("File error happened");
        }
    }
}

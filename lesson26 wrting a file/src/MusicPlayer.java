import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args){
        //Java support these audio (files: .wav, .au, .aiff)
        String filePath= "Lady_Gaga_Bruno_Mars_-_Die_With_a_Smile_NEW_2024_(mp3.pm).wav";
        File file= new File(filePath);

        try(Scanner scanner= new Scanner(System.in); AudioInputStream audio= AudioSystem.getAudioInputStream(file)){
            Clip clip= AudioSystem.getClip();   //music player
            clip.open(audio);
            System.out.println("Nothing error");
            String response= "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                response= scanner.next().toUpperCase();
                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid input");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Couldn't locate the file");
        }
        catch(IOException e){
            System.out.println("Something error happened");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio Type Is Not Compatible");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio source");
        }
    }
}

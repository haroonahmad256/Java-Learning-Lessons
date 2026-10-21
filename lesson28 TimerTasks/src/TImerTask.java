import java.util.Timer;
import java.util.TimerTask;

public class TImerTask {
    public static void main(String[] args){
        //Timer= Class that schedule tasks at specific times or periodically
        //       Useful for sending notifications, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the timer class to define your task
        //             Create subclass of TimerTask and @Override run()

        Timer timer= new Timer();
        TimerTask timertask = new TimerTask(){
            int count=3;
            @Override
            public void run(){
                System.out.println("Hello this program will be run after 3 seconds");
                count--;
                if (count<=0){
                    System.out.println("Task has been completed");
                    timer.cancel();
                }
            }
        };
        System.out.println("Loading........................");
        timer.schedule(timertask, 3000, 1000);  //by adding 100 the program will be repeated after every 1 second

    }
}

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class countDown {
    public static void main(String[] args){
        int countdown;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seconds from which you want to start timer: ");
        countdown= scanner.nextInt();
        Timer timer= new Timer();

        TimerTask task= new TimerTask() {
            int count= countdown;
            @Override
            public void run() {
                System.out.printf("\r%d",count);
                count--;
                if (count<0){
                    System.out.println("\nTime reached");
                    timer.cancel();

                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}

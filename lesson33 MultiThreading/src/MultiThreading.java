public class MultiThreading {
    public static void main(String[] args){
        //MultiThreading = Enables program to run multiple threads concurrently
        //                 (Thread = A set of instructions that run independently)
        //                 Useful for background tasks or time-consuming operations
        //                 It is about performing multiple tasks at the same time
        int i=0;
        System.out.println("Game Start");
        Thread thread1= new Thread(new MyRunnable("Pakistan"));
        Thread thread2= new Thread(new MyRunnable("India"));
        thread1.start();
        thread2.start();
        try{
            thread1.join();     //by using join method we will make our main thread to wait for thread1 and 2 to finish
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Interruption Occurred");
        }

        System.out.println("Game Over"); //in out main thread it doesn't wait for thread1 and thread2 to finish
                                         //main thread ends immediately and MyRunnable thread runs after
        //To make our main thread to wait other thread to finish:

        //Here two threads are running at the same time so it is Multi Threading
    }
}

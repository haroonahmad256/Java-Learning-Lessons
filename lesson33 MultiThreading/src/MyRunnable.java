public class MyRunnable implements Runnable {
    private final String message;
    MyRunnable(String message){
        this.message= message;
    }

    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            try{
                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName()+" "+i); This gives the names of thread
                System.out.println(message);
            }
            catch (InterruptedException e){
                System.out.println("Interruption occurred!");
            }
        }
    }
}

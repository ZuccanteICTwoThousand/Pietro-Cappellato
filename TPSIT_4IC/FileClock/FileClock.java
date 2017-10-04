import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class FileClock implements Runnable{
    private int ID;
    private Thread[] thread;

    public FileClock(int ID, Thread[] thread){
        this.ID = ID;
        this.thread = thread;
    }

    @Override
    public void run() {
        for (;;) {
            System.out.printf("%d says: %s\n", ID, new Date());
            try {
                //System.out.println(ID + " is going to bed...");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("They killed me while I was sleeping! i was the number " + ID);
                break;
            }
            if(last()) {
                System.out.println("I'm the last, the number "+ID+", I want to suicide...");
                Thread.currentThread().interrupt();
                break;
            }
            else
                thread[new Random().nextInt(thread.length)].interrupt();
        }
    }

    private boolean last(){
        for(int i = 0; i < thread.length; i++)
            if(i != ID && thread[i].isAlive())
                return false;
        return true;
    }
}


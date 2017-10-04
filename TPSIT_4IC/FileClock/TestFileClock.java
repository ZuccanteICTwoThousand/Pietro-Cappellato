import java.util.concurrent.TimeUnit;

public class FileClockTest {
    public static void main(String[] args) {
        Thread[] thread = new Thread[10];
        for(int i = 0; i < thread.length; i++){
            thread[i] = new Thread(new FileClock(i, thread));
            thread[i].start();
        }
    }
}

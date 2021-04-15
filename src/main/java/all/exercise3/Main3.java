package all.exercise3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main3 {
    static volatile int buff;


    private static final Lock lock = new ReentrantLock();
    static void increment2(){
        lock.lock();
        buff++;
        lock.unlock();
    }

    public static void main(String[] args) throws Exception {

        Thread three = new Thread(()->{
            for (int i=0;i<2000;i++) {
                increment2();
            }
        });
        Thread four = new Thread(()->{
            for (int i=0;i<2000;i++){
                increment2();
            }
        });

        three.start();
        four.start();

        Thread.sleep(100);
        System.out.println(buff);
    }
}

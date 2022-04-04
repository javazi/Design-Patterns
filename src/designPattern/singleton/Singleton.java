package designPattern.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Thread safe Singleton

public class Singleton {

    private static Singleton singleton;
    private final static Lock lock = new ReentrantLock();

    private Singleton() {}

    public static Singleton getSingleton() {
        lock.lock();
        if (singleton == null)
            singleton = new Singleton();
        lock.unlock();
        return singleton;
    }

    static class SampleRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Singleton.getSingleton()+" / Thread:"+Thread.currentThread().getId());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Executor executor = Executors.newCachedThreadPool();
        SampleRunnable sampleRunnable = new SampleRunnable();
        for (int i = 0; i < 10; i++) {
            executor.execute(sampleRunnable);
        }

    }
}


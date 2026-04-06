package LabUnit13;

class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running.");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " awake.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class RunnableThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");
        t1.start();
        t2.start();
    }
}

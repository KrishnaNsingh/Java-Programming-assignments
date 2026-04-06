package LabUnit14;

class TestThread extends Thread {
    TestThread() {
        start();
    }
    public void run() {
        System.out.println(getName() + " is running.");
    }
}

public class CheckThreads {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        System.out.println("Thread 1 alive: " + t1.isAlive());
        System.out.println("Thread 2 alive: " + t2.isAlive());
    }
}

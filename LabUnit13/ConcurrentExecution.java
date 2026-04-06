package LabUnit13;

class MyThread extends Thread {
    MyThread(String name) {
        super(name); // Call base class constructor
        start();     // Start thread immediately
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class ConcurrentExecution {
    public static void main(String[] args) {
        new MyThread("ChildThread");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

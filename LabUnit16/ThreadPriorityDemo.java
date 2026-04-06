package LabUnit16;

class PriorityThread extends Thread {
    PriorityThread(String name) { super(name); }
    public void run() {
        System.out.println(getName() + " (Priority " + getPriority() + ") is running.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityThread low = new PriorityThread("Low-Priority-Thread");
        PriorityThread high = new PriorityThread("High-Priority-Thread");

        low.setPriority(Thread.MIN_PRIORITY);  // 1
        high.setPriority(Thread.MAX_PRIORITY); // 10

        low.start();
        high.start(); // High priority thread will likely finish first
    }
}

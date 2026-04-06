package LabUnit14;

public class CurrentThreadRef {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
    }
}

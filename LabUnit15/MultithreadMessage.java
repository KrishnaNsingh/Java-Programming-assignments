package LabUnit15;

class JavaMessageThread extends Thread {
    public void run() {
        System.out.println("Java is hot, aromatic, and invigorating");
    }
}

public class MultithreadMessage {
    public static void main(String[] args) {
        JavaMessageThread t1 = new JavaMessageThread();
        JavaMessageThread t2 = new JavaMessageThread();
        t1.start();
        t2.start();
    }
}

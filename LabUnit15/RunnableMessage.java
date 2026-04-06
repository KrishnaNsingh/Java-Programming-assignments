package LabUnit15;

class MyClass implements Runnable {
    public void run() {
        System.out.println("Java is hot, aromatic, and invigorating (from Runnable)");
    }
}

public class RunnableMessage {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        Thread t1 = new Thread(myObj);
        Thread t2 = new Thread(myObj);
        t1.start();
        t2.start();
    }
}

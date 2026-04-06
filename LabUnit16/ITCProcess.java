package LabUnit16;

class Stock {
    int contents;
    boolean available = false;

    public synchronized void addStock(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        contents = value;
        available = true;
        System.out.println("Producer added: " + contents);
        notify();
    }

    public synchronized void getStock() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        available = false;
        System.out.println("Consumer took: " + contents);
        notify();
    }
}

class Producer extends Thread {
    Stock s;
    Producer(Stock s) { this.s = s; }
    public void run() {
        for (int i = 1; i <= 5; i++) s.addStock(i);
    }
}

class Consumer extends Thread {
    Stock s;
    Consumer(Stock s) { this.s = s; }
    public void run() {
        for (int i = 1; i <= 5; i++) s.getStock();
    }
}

public class ITCProcess {
    public static void main(String[] args) {
        Stock s = new Stock();
        new Producer(s).start();
        new Consumer(s).start();
    }
}

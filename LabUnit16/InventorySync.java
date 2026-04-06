package LabUnit16;

class Inventory {
    private int items = 100;

    // synchronized method ensures object monitor is locked
    public synchronized void reduceStock(int amount) {
        if (items >= amount) {
            System.out.println(Thread.currentThread().getName() + " is buying " + amount + " items.");
            try { Thread.sleep(100); } catch (Exception e) {}
            items -= amount;
            System.out.println("Remaining Stock: " + items);
        } else {
            System.out.println("Insufficient stock for " + Thread.currentThread().getName());
        }
    }
}

public class InventorySync {
    public static void main(String[] args) {
        Inventory shop = new Inventory();
        Thread t1 = new Thread(() -> shop.reduceStock(60), "Customer 1");
        Thread t2 = new Thread(() -> shop.reduceStock(50), "Customer 2");
        t1.start();
        t2.start();
    }
}

package LabUnit11;

class ModifierDemo {
    // Access Modifiers
    public String publicVar = "Public: Accessible anywhere";
    private String privateVar = "Private: Only in this class";
    protected String protectedVar = "Protected: Subclasses/Package";

    // Non-Access Modifiers
    static int count = 0; // Shared by all instances
    final double PI = 3.14159; // Constant value

    public void display() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println("Static Count: " + count);
        System.out.println("Final PI: " + PI);
    }
}

public class Main {
    public static void main(String[] args) {
        ModifierDemo obj = new ModifierDemo();
        obj.display();
    }
}

package LabUnit9;

class Parent {
    void show(double num) {
        System.out.println("Parent show (double): " + num);
    }
}

class Child extends Parent {
    @Override
    void show(double num) {
        System.out.println("Child show (double): " + num);
    }
}

public class TypeConversionDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        int x = 100;
        
        // Automatic type conversion: int x is promoted to double 
        // because the overridden method expects a double.
        obj.show(x); 
    }
}

package LabUnit10;

public class PrecedenceDemo {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;
            System.out.print(data);
        } 
        // Subclass exception caught first
        catch (ArithmeticException e) {
            System.out.println("Caught specific ArithmeticException.");
        } 
        // Base class exception caught last
        catch (Exception e) {
            System.out.println("Caught general Exception.");
        }
    }
}

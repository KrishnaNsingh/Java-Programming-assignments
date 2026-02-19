package LabUnit10;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int x = 10 / 2;
            System.out.println("Result: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Error: Divide by zero.");
        } finally {
            System.out.println("Finally block: This always runs.");
        }
    }
}
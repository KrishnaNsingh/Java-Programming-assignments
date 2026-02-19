package LabUnit10;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[10] = 30 / 0; // Will trigger ArithmeticException first
        } catch (ArithmeticException e) {
            System.out.println("Task 1: Arithmetic error (Division by zero).");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task 2: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Task 3: Some other error occurred.");
        }
    }
}

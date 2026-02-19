package LabUnit10;

public class NegativeArrayDemo {
    public static void main(String[] args) {
        try {
            int size = -5;
            int[] arr = new int[size]; // This will trigger the exception
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Cannot create an array with a negative size.");
            System.out.println("Exception caught: " + e);
        }
    }
}

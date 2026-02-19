package LabUnit7;

public class Fibonacci {
    public static int computeFib(int i) {
        // Base cases as per your definition F0=1, F1=1
        if (i == 0 || i == 1) {
            return 1;
        }
        // Recursive step for i > 1
        return computeFib(i - 1) + computeFib(i - 2);
    }

    public static void main(String[] args) {
        int n = 6; 
        System.out.println("Fibonacci value at F" + n + " is: " + computeFib(n));
        
        // Printing the first 7 numbers in the sequence
        System.out.print("Sequence: ");
        for(int j = 0; j <= n; j++) {
            System.out.print(computeFib(j) + " ");
        }
    }
}
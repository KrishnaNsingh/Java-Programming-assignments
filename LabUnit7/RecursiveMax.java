package LabUnit7;

public class RecursiveMax {
    public static int findMax(int a[], int n) {
        // Base case: if array has only one element
        if (n == 1) {
            return a[0];
        }
        
        // Recursive step: find max of n-1 elements
        int maxOfRest = findMax(a, n - 1);
        
        // Compare and return the larger value
        return Math.max(maxOfRest, a[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 9, 102, 56};
        System.out.println("Maximum value: " + findMax(arr, arr.length));
    }
}

package PLA;

// import java.util.Scanner;

class londest_sequnce_of_1 {
    private static int findMaxConsecutiveOnes(int[] a, int k) {
        int maxOnes = Integer.MIN_VALUE;
        int numReplacements = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            if (a[windowEnd] == 0) {
                numReplacements++;
            }
            while (numReplacements > k) {
                if (a[windowStart] == 0) {
                    numReplacements--;
                }
                windowStart++;
            }
            maxOnes = Math.max(maxOnes, windowEnd - windowStart + 1);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
        int k = 1;
        int result = findMaxConsecutiveOnes(a, k);
        System.out.printf("Length of longest contiguous subarray containing only 1s after replacement = %d%n", result);
    }
}

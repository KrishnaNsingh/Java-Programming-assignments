package PLA;

public class equlibriumPosition {

    static int findEquilibrium(int[] arr, int n) {

        int[] preSum = new int[n];
        int[] suffSum = new int[n];

        preSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }

        suffSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffSum[i] = suffSum[i + 1] + arr[i];
        }

        for (int i = 1; i < n - 1; i++) {
            if (preSum[i - 1] == suffSum[i + 1])
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 5, 3, 3, 2, 6, -4, 2 };
        int n = arr.length;

        int ans = findEquilibrium(arr, n);

        if (ans == -1)
            System.out.println("No equilibrium index");
        else
            System.out.println("Equilibrium index = " + ans);
    }
}
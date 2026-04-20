package PLA2;

public class Josephus {

    public static int josephus(int n, int k) {
        if (n == 1)
            return 0;

        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 5, k = 2;

        // +1 because we use 0-based indexing
        System.out.println(josephus(n, k) + 1);
    }
}
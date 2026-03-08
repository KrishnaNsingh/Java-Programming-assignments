package PLA;

class Chinese_Remainder_Theorem {

    static int findX(int m[], int r[], int n) {

        int prod = 1;

        // Step 1: product of all mod values
        for(int i = 0; i < n; i++)
            prod *= m[i];

        int result = 0;

        // Step 2: Apply CRT formula
        for(int i = 0; i < n; i++) {

            int pp = prod / m[i];
            result += r[i] * mulInv(pp, m[i]) * pp;
        }

        // Step 3: return smallest positive solution
        return result % prod;
    }

    // Function to find modular inverse
    static int mulInv(int a, int m) {

        a = a % m;

        for(int x = 1; x < m; x++)
            if((a * x) % m == 1)
                return x;

        return 1;
    }

    public static void main(String[] args) {

        int m[] = {3,4,5};
        int r[] = {2,3,1};

        int n = r.length;

        System.out.println("x = " + findX(m,r,n));
    }
}
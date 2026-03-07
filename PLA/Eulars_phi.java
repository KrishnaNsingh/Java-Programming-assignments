package PLA;

// https://chatgpt.com/c/69ac7b21-6854-8320-8483-20e477abf99c

class Eular_phi {
    static int phi(int n) {
        int result = n;
        for (int p = 2; p<= Math.sqrt(n); p++) {
            if (n % p == 0) {
                while (n % p == 0)
                    n /= p;
                result -= result / p;
            }
        }
        if (n > 1)
            result -= result / n;
        return result;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 1000;
        System.out.println(phi(n));
    }
}

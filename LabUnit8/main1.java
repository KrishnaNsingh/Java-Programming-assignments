package LabUnit8;

class Number {
    private double val;

    public Number(double val) { this.val = val; }

    // Boolean Checks
    public boolean isZero() { return val == 0; }
    public boolean isPositive() { return val > 0; }
    public boolean isNegative() { return val < 0; }
    public boolean isOdd() { return (long)val % 2 != 0; }
    public boolean isEven() { return (long)val % 2 == 0; }

    public boolean isPrime() {
        long n = (long)val;
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean isArmstrong() {
        long n = (long)val, sum = 0, temp = n;
        int digits = String.valueOf(n).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }

    // Mathematical Returns
    public double getFactorial() {
        double fact = 1;
        for (int i = 1; i <= (long)val; i++) fact *= i;
        return fact;
    }

    public double getSqrt() { return Math.sqrt(val); }
    public double getSqr() { return val * val; }
    
    public double getReverse() {
        long n = (long)val, rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return (double)rev;
    }

    // Void methods
    public void listFactor() {
        System.out.print("Factors: ");
        for (int i = 1; i <= (long)val; i++) {
            if ((long)val % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    public void dispBinary() {
        System.out.println("Binary: " + Long.toBinaryString((long)val));
    }
}
package PLA;

public class EuclidGCD {
    static int GCD(int a, int b){
        while(b != 0){
            int result = a%b;
            a = b;
            b = result;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int gcd = GCD(a,b);
        System.out.println(gcd);
    }
}

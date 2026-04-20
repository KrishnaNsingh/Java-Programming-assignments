package PLA;

import java.util.*;

public class test {
    public static int GCD(int a, int b){
        while(b != 0){
            int ans = a % b;
            a = b;
            b = ans;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 48;
        int b = 6;
        int answer = GCD(a, b);
        System.out.println(answer);
    }
}

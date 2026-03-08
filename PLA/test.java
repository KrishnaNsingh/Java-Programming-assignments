package PLA;

// import java.util.*;
public class test {
    static int phi(int n){
        int result = n;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i == 0){
                while(n%i==0){
                    n/=i;
                }
                result -= result/i;
                System.out.println(i); 
            }
        }
        if(n > 1){
            result -= result/n; 
            System.out.println(n); 
        }
        return result;
    }
    public static void main(String[] args){
        int n = 90;
        System.out.print(phi(n));
    }
}

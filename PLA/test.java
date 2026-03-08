package PLA;



// import java.util.*;
public class test {
    static int CRT(int a[], int m[], int n, int p){
        int x = 0;
        for(int i=0; i<n; i++){
            int M = p/m[i];
            int y = 0;
            for(int j=0; j<m[i]; j++){
                if((M*j) % m[i] == 1){
                    y = j;
                    break;
                }
            }
            x += a[i]*M*y; 
        }
        return x%p;
    }
    public static void main(String[] args){
        int m[] = {3, 4, 5};
        int a[] = {2, 3, 1};
        int prod = 1;
        int n = m.length;
        for(int i=0; i<n; i++){
            prod *= m[i];
        }
        System.out.println(CRT(a, m, n, prod));
    }
}

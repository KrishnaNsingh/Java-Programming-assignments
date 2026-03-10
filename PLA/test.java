package PLA;



// import java.util.*;
public class test {
    static int MaxProduct(int[] arr){
        int n = arr.length;
        if(n == 0)return 0;
        int maxPro = arr[0];
        int minPro = arr[0];
        int result = maxPro;
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int tempMax = Math.max(curr , Math.max(maxPro*curr , minPro*curr));
            minPro = Math.min(curr , Math.min(maxPro*curr , minPro*curr));
            maxPro = tempMax;
            result = Math.max(result, maxPro);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {7,4,3,-2,5,2};
        int maxProduct = MaxProduct(arr);
        System.out.println("Max Product is :" + maxProduct);
    }
}

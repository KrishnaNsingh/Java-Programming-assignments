package PLA;



// import java.util.*;
public class test {
    static int equlibriumPosition(int[] arr){
        int n = arr.length;
        int[] preSum = new int[n];
        int[] suffsum = new int[n];

        preSum[0] = arr[0];
        for(int i=1; i<n; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }

        suffsum[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffsum[i] = suffsum[i+1] + arr[i];
        }

        for(int i=1; i<n; i++){
            if(preSum[i-1] == suffsum[i+1]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 5, 3, 3, 2, 6, -4, 2 };
        int result = equlibriumPosition(arr);
        System.out.println("Equlibrium Position is : "+ result);
    }
}

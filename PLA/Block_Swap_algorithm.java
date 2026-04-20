package PLA;

public class Block_Swap_algorithm {
    public static void Swap_algorithm(int[] arr, int k, int n){
        if (k == 0 || k == n) return;

        k = k % n;

        int[] temp = new int[k];
        
        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            arr[i] = arr[i+k];
        }
        for(int i=n-k; i<n; i++){
            arr[i] = temp[i-n+k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        int n = arr.length;

        Swap_algorithm(arr, k, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

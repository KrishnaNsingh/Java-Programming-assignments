package PLA2;

public class sectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        selectionSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}


// TC = n^2 , SC = 1
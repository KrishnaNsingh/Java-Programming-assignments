package PLA;

public class LeaderArray {
    static void leaderArr(int[] arr){
        int n = arr.length;
        int rightEle =  arr[n-1];
        System.out.print(rightEle + " ");
        for(int i=n-2; i>=0; i--){
            if(arr[i] > rightEle){
                rightEle = arr[i];
                System.out.print(rightEle + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,3,6,2,7,8,1};
        leaderArr(arr);
    }
}

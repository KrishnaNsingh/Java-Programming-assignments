package PLA;

public class Maximum_sum_Matrix {
    static int hourGlass(int[][] arr){
        int row = arr.length;
        int colm = arr[0].length;
        if(row < 3 || colm < 3){
            return -1;
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<row-2; i++){
            for(int j=0; j<colm-2; j++){
                int sum = ((arr[i][j] + arr[i][j+1] + arr[i][j+2]) + (arr[i+1][j+1]) + (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]));
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 2, 1, 4, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 1, 1, 0, 1, 0 } };
        int result = hourGlass(mat);
        System.out.println("Max Sum of Hour Glass is : " +  result);
    }
}

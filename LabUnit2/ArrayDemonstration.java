package LabUnit2;
public class ArrayDemonstration {
    public static void main(String[] args) {
        
        // 2.3.2 One-dimensional array
        int[] oneD = {10, 20, 30, 40};
        
        // 2.3.1 Find the length of array
        System.out.println("Length of 1D array: " + oneD.length);

        // 2.3.3 Two-dimensional array (Rows and Columns)
        int[][] twoD = { {1, 2}, {3, 4} };
        System.out.println("2D Array element [1][0]: " + twoD[1][0]);

        // 2.3.4 Multi-dimensional array (3D example)
        int[][][] multiD = new int[2][2][2]; 
        multiD[0][0][0] = 100;
        System.out.println("Multi-D Array element [0][0][0]: " + multiD[0][0][0]);
    }
}

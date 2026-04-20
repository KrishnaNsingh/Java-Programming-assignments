package PLA;

import java.util.Arrays;
import java.util.List;

// public class MaxProduct {
//     public static int maxProduct(List<Integer> nums) {
//         if (nums.size() == 0)
//             return 0;
//         int maxSoFar = nums.get(0);
//         int minSoFar = nums.get(0);
//         int result = maxSoFar;
//         for (int i = 1; i < nums.size(); i++) {
//             int curr = nums.get(i);
//             int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
//             minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
//             maxSoFar = tempMax;
//             result = Math.max(maxSoFar, result);
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(2, 5, -15);
//         int maxProduct = maxProduct(nums);
//         System.out.println("Max Product: " + maxProduct);
//     }
// }


public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            // If current number is negative, swap max and min
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update max and min product
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update result
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        int answer = maxProduct(nums);

        System.out.println("Maximum Product Subarray = " + answer);
    }
}

// TC = n , SC = 1
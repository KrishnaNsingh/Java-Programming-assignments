package PLA;

// import java.util.Scanner;

class londest_sequnce_of_1 {

    static int longestOnes(int[] nums, int k){

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] == 0)
                zeroCount++;

            while(zeroCount > k){

                if(nums[left] == 0)
                    zeroCount--;

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args){

        int nums[] = {1,1,1,1,0,0,0,1,1,1,1,1,0};
        int k = 1;

        System.out.println(longestOnes(nums,k));
    }
}
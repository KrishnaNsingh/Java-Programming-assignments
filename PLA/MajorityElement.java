package PLA;

class MajorityElement{
    static int majorityElement(int[] arr){
        int n = arr.length;
        int m = -1;
        int i=0;
        for(int j=0; j<n; j++){
            if(i == 0){
                m = arr[j];
                i = 1;
            }
            else if(m == arr[j]){
                i++;
            }else i--;
        }
        // Verify majority
        int count = 0;
        for(int x : arr){
            if(x == m) count++;
        }

        if(count > n/2)
            return m;

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,3,3};
        int ans = majorityElement(arr);
        if(ans == -1)
            System.out.println("No majority element");
        else
            System.out.println("Majority element is : " + ans);
    }
}
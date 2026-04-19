package PLA2;

public class Weighted_Substring {
    public static int WeightedString(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int value = s.charAt(i) - 'a' + 1;
            sum += value * (i+1);
        }

        return sum;
    }
    public static void main(String[] args){
        String s = "abc";
        System.out.println(WeightedString(s));
    }
}

// TC = n   SC = 1
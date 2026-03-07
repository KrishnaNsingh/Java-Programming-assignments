package PLA;

import java.util.HashMap;

// O(n) - TC and O(1) - SC

public class Strobogrammatic_number {
    public static boolean isStrobogrammatic(String num) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {

            char l = num.charAt(left);
            char r = num.charAt(right);

            if (!map.containsKey(l) || map.get(l) != r)
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String num = "101";

        if (isStrobogrammatic(num))
            System.out.println("Strobogrammatic");
        else
            System.out.println("Not Strobogrammatic");

    }
}

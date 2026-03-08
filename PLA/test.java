package PLA;

import java.util.HashMap;

// import java.util.*;
public class test {
    static boolean isStrobogrammatic(String n){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        
        int left = 0;
        int right = n.length()-1;
        while(left <= right){
            char l = n.charAt(left);
            char r = n.charAt(right);

            if(!map.containsKey(l) || map.get(l) != r){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String num = "91";

        if(isStrobogrammatic(num)){
            System.out.print("Yes number is Strobogrammatic");
        }else{
            System.out.print("No number is not Strobogrammatic");
        }
    }
}

package PLA2;

import java.util.*;

public class Sorted_Unique_Permutation{

    public static void backtrack(String s, boolean[] used, String curr) {
        if (curr.length() == s.length()) {
            System.out.println(curr);
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            // Skip used characters
            if (used[i]) continue;

            // Skip duplicates
            if (i > 0 && s.charAt(i) == s.charAt(i - 1) && !used[i - 1])
                continue;

            used[i] = true;
            backtrack(s, used, curr + s.charAt(i));
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        String s = "aab";

        char[] arr = s.toCharArray();
        Arrays.sort(arr); // Important
        s = new String(arr);

        boolean[] used = new boolean[s.length()];
        backtrack(s, used, "");
    }
}
package PLA2;

import java.util.*;

public class Combination {

    public static void combine(int n, int r, int start, List<Integer> curr) {
        if (curr.size() == r) {
            System.out.println(curr);
            return;
        }

        for (int i = start; i <= n; i++) {
            curr.add(i);                  // choose
            combine(n, r, i + 1, curr);  // explore
            curr.remove(curr.size() - 1); // unchoose
        }
    }

    public static void main(String[] args) {
        int n = 4, r = 2;
        combine(n, r, 1, new ArrayList<>());
    }
}
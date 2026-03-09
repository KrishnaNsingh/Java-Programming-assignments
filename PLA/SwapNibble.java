package PLA;

import java.util.*;

class SwapNibble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int swap_Nibble_Num;
        swap_Nibble_Num = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        System.out.println(num);
        System.out.print(swap_Nibble_Num);
        sc.close();
    }
}
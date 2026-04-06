package LabUnit12;

import java.util.Scanner;

public class UpperCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many characters do you want to enter? ");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " characters:");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            sb.append(Character.toUpperCase(c));
        }
        System.out.println("Result: " + sb.toString());
        sc.close();
    }
}

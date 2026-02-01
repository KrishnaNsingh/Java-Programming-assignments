package LabUnit2;

// 2.2 Write a program to give the example of control statements.
// 2.2.1 If statements.
// 2.2.2 Switch Statements.
// 2.2.3 For loop.
// 2.2.4 While Statements.
// 2.2.5 Do statements

public class ControlStatements {
    public static void main(String[] args) {
        int x = 10;

        // 2.2.1 If statement
        if (x > 5) { System.out.println("x is greater than 5"); }

        // 2.2.2 Switch statement
        switch (x) {
            case 10: System.out.println("Value is 10"); break;
            default: System.out.println("Unknown value");
        }

        // 2.2.3 For loop (Counting)
        System.out.print("For loop: ");
        for (int i = 0; i < 3; i++) { System.out.print(i + " "); }

        // 2.2.4 While loop (Condition first)
        System.out.print("\nWhile loop: ");
        int j = 0;
        while (j < 3) { System.out.print(j + " "); j++; }

        // 2.2.5 Do-while loop (Execution first)
        System.out.print("\nDo-while: ");
        int k = 0;
        do { System.out.print(k + " "); k++; } while (k < 3);
    }
}

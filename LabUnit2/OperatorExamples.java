package LabUnit2;
// Write a program to give the examples of operators.
// 2.1.1 Increment and decrement operators.
// 2.1.2 Bitwise Complement Operator.
// 2.1.3 Arithmetic operator.
// 2.1.4 Relational Operator
// 2.1.5 Bitwise operator.
// 2.1.6 Conditional Operator.
public class OperatorExamples {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // 2.1.1 Increment and Decrement
        System.out.println("Increment: " + (++a)); // Pre-increment: 11
        System.out.println("Decrement: " + (--b)); // Pre-decrement: 19

        // 2.1.2 Bitwise Complement (Inverts bits)
        System.out.println("Complement: " + (~a)); // -(a + 1)

        // 2.1.3 Arithmetic (+, -, *, /, %)
        System.out.println("Arithmetic (a + b): " + (a + b));

        // 2.1.4 Relational (Returns boolean)
        System.out.println("Relational (a > b): " + (a > b));

        // 2.1.5 Bitwise (&, |, ^)
        System.out.println("Bitwise AND (a & b): " + (a & b));

        // 2.1.6 Conditional (Ternary) Operator
        String result = (a < b) ? "a is smaller" : "b is smaller";
        System.out.println("Conditional Result: " + result);
    }
}
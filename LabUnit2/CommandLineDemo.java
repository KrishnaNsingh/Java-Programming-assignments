package LabUnit2;

public class CommandLineDemo {
    public static void main(String[] args) {
        // 2.4.2 To get the name using command line
        // Usage: java CommandLineDemo Alice 10 20 apple 5
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("No arguments provided.");
            return;
        }

        // 2.4.1 Sum of arguments and count of invalid integers
        int sum = 0;
        int invalidCount = 0;

        // We start from index 1 assuming index 0 was the name
        for (int i = 1; i < args.length; i++) {
            try {
                int value = Integer.parseInt(args[i]);
                sum += value;
            } catch (NumberFormatException e) {
                // If it's not a valid integer, increment the invalid counter
                invalidCount++;
            }
        }

        System.out.println("--- Results ---");
        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Count of invalid integers: " + invalidCount);
    }
}

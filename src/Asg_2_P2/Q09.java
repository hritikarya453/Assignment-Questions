package Asg_2_P2;


public class Q09 {
    public static void main(String[] args) {

        // Check if argument is provided
        if (args.length != 1) {
            System.out.println("Please enter a four-digit number.");
            return;
        }

        // Convert argument to integer
        int num = Integer.parseInt(args[0]);

        // Extract first and last digit
        int lastDigit = num % 10;
        int firstDigit = num / 1000;

        // Calculate sum
        int sum = firstDigit + lastDigit;

        // Display result
        System.out.println(
                "Sum of the first and last digit of " + num + " is: " + sum
        );
    }
}


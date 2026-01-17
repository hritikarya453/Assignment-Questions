package Asg_2_P2;


public class Q07 {
    public static void main(String[] args) {
        // Generate two random integers between 1 and 6
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;

        // Calculate and print the sum
        int sum = die1 + die2;

        // Display results
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Sum: " + sum);
    }
}

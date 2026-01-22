// Write a Java program using a do-while loop to repeatedly ask the user to enter a
//number, and display whether it is even or odd.
//
//The program should stop when the user enters 0.


package Assignment4;

import java.util.Scanner;

public class Q03EvenOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }

        } while (num != 0);

        System.out.println("Program terminated.");
        scanner.close();
    }
}
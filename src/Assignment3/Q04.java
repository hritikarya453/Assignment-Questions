package Assignment3;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 1, max = 9;

        // Ask user for input
        System.out.print("Enter user number (1 to 9): ");
        int ug = in.nextInt();

        // Computer randomly guesses a number
        int cg = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Computer guesses: " + cg);

        // Compare guesses
        if (ug == cg) {
            System.out.println("You got it right");
        } else if (Math.abs(ug - cg) == 1) {
            System.out.println("Almost got it");
        } else {
            System.out.println("You got it wrong");
        }
    }
}
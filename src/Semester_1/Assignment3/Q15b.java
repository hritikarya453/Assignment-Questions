package Semester_1.Assignment3;


import java.util.Scanner;

public class Q15b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Scissor-Rock-Paper Game!");
        System.out.println("Enter your choice:");
        System.out.println("0 for Scissor ✂️");
        System.out.println("1 for Rock 🪨");
        System.out.println("2 for Paper 📄");

        int ug = sc.nextInt();

        if (ug < 0 || ug > 2) {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
        } else {
            int cg = (int) (Math.random() * (2-0+1)+0);

            // Display user choice
            System.out.print("You choose: ");
            if (ug == 0)
                System.out.println("Scissor");
            else if (ug == 1)
                System.out.println("Rock");
            else
                System.out.println("Paper");

            // Display computer choice
            System.out.print("Computer choose: ");
            if (cg == 0)
                System.out.println("Scissor");
            else if (cg == 1)
                System.out.println("Rock");
            else
                System.out.println("Paper");

            // Determine result
            if (ug == cg) {
                System.out.println("It's a Draw!");
            } else if ((ug == 0 && cg == 2) ||
                    (ug == 1 && cg == 0) ||
                    (ug == 2 && cg == 1)) {
                System.out.println("You Win! 🎉");
            } else {
                System.out.println("You Lose! 😢");
            }
        }

        sc.close();
    }
}


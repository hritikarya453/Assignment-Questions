package Assignment3;

import java.util.Scanner;

public class Q11 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer");
        int a = in.nextInt();

        if(a%6==0||a%5==0) {
            if (a % 6 == 0 && a % 5 == 0) {
                System.out.println("Is" + a + "divisible by 5 and 6? true ");
            } else {
                System.out.println("Is"+a+" divisible by 5 or 6, but not both? True ");
            }
        }
            else{
                System.out.println("Is "+ a+" divisible by 5 or 6? true ");
            }

    }
}


/*
import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check divisibility
        boolean divisibleBy5 = (number % 5 == 0);
        boolean divisibleBy6 = (number % 6 == 0);

        // Display results
        System.out.println("Is " + number + " divisible by 5 and 6? " + (divisibleBy5 && divisibleBy6));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (divisibleBy5 || divisibleBy6));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (divisibleBy5 ^ divisibleBy6));
    }
}
*/

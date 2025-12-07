package Assignment_5;
import java.util.Scanner;

public class Q11{
    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // numbers <= 1 are not prime
        }
        if (n == 2) {
            return true;  // 2 is prime
        }
        if (n % 2 == 0) {
            return false; // other even numbers are not prime
        }
        // check divisibility up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = in.nextInt();

        // Swap if n1 > n2
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        System.out.print("Prime numbers between " + n1 + " and " + n2 + " are: ");
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
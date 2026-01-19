package JavaSetPYQ;

import java.util.Scanner;

public class Mersenne {


    public static long mersenneNumber(int p) {
        return (long) Math.pow(2, p) - 1;
    }

    public static boolean isPrime(long num) {
        if (num <= 1)
            return false;

        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting value of p: ");
        int start = sc.nextInt();

        System.out.print("Enter ending value of p: ");
        int end = sc.nextInt();

        // checking Pre-condition
        if (start < 2 || end > 31 || start > end) {
            System.out.println("Invalid input! p must be between 2 and 31.");
            return;
        }

        System.out.println();
        //  Tabular format
        System.out.println("p\t2^p - 1");
        System.out.println("----------------------");

        for (int p = start; p <= end; p++) {
            long m = mersenneNumber(p);

            if (isPrime(m)) {
                System.out.println(p + "\t" + m);
            }
        }

        sc.close();
    }
}

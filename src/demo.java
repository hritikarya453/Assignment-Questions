import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n (n > 3): ");
        int n = sc.nextInt();

        if (n <= 3) {
            System.out.println("Please enter a value greater than 3.");

            return;
        }

        int a = 0, b = 1, c = 1;

        // Print first three terms
        System.out.print(a + " " + b + " " + c);

        // Generate remaining terms
        for (int i = 4; i <= n; i++) {
            int term = a + b + c;
            System.out.print(" " + term);
            a = b;
            b = c;
            c = term;
        }


    }
}
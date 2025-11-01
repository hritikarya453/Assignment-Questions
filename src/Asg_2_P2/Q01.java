package Asg_2_P2;

public class Q01 {
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two positive integers.");
            return;
        }

        // Parse command-line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Check if both are positive
        if (a <= 0 || b <= 0) {
            System.out.println("Both numbers must be positive integers.");
            return;
        }

        // Check divisibility
        boolean result = (a % b == 0) || (b % a == 0);
        System.out.println("Eevenly divides " +a+" " +b+ " -->  "+result);
    }
}
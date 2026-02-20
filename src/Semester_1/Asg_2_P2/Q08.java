package Semester_1.Asg_2_P2;

public class Q08 {
    public static void main(String[] args) {

        // Check if exactly 3 arguments are provided
        if (args.length != 3) {
            System.out.println("Please provide exactly three positive integers.");
            return;
        }

        // Convert command-line arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Check the condition
        boolean result = (a <= b * c) || (b <= a * c) || (c <= a * b);

        // Print result
        System.out.println(result);
    }
}

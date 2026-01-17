package Asg_2_P2;

public class Q03 {
    static void main(String[] args) {
        if(args.length!=1) {
            System.out.println("Please provide exactly two positive integers");
            return;
        }
        char ch = args[0].charAt(0);

        // Convert character to ASCII value
        int ascii = (int) ch;

        // Display the result
        System.out.println("ASCII value of " + ch + " is " + ascii);
    }
}

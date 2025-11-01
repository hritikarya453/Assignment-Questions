package Asg_2_P2;

public class Q06 {
    static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        // Print in ascending order
        System.out.println("Ascending order: " + min + " " + mid + " " + max);
    }
}

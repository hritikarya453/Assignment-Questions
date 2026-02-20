package Semester_2.Asg_1;
import java.util.Scanner;

public class Q_13_DotProductArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of arrays
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        // Input first array
        System.out.print("Enter elements of array A: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter elements of array B: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Compute dot product array
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        // Output result
        System.out.print("Dot Product Array C: ");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

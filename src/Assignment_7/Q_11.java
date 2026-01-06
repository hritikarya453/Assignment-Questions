package Assignment_7;
import java.util.Scanner;

public class Q_11 {

    // Method to find the minimum value
    public static double max(double[] array) {
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] n = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextDouble();
        }

        double maxValue = max(n);

        System.out.println("The minimum number is: " + maxValue);
    }
}

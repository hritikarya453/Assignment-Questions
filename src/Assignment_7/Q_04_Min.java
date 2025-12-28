package Assignment_7;

import java.util.Scanner;

public class Q_04_Min {

    public static double min(double[] array) {
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }

        System.out.println("The minimum number is: " + min(arr) );
        in.close();
    }
}

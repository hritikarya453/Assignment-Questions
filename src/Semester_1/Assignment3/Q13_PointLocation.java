package Semester_1.Assignment3;
import java.util.Scanner;

public class Q13_PointLocation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate: ");
        double x = sc.nextDouble();

        System.out.print("Enter y-coordinate: ");
        double y = sc.nextDouble();

        String result = "";

        if (x == 0 && y == 0) {
            result = "is at the Origin";
        } else if (x == 0) {
            result = "is on the Y-axis";
        } else if (y == 0) {
            result = "is on the X-axis";
        } else if (x > 0 && y > 0) {
            result = "is in quadrant I";
        } else if (x < 0 && y > 0) {
            result = "is in quadrant II";
        } else if (x < 0 && y < 0) {
            result = "is in quadrant III";
        } else {
            result = "is in quadrant IV";
        }

        System.out.println("(" + x + ", " + y + ") " + result);
    }
}

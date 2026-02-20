package Semester_1.Assignment_7;

import java.util.Scanner;

public class Q_02_ElementsOccurrence {

    public static void readInput(int[] counts) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers between 1 and 100: ");

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num >= 1 && num <= 100) {
                counts[num]++;
            }
        }
    }

    public static void displayCounts(int[] counts) {
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                if (counts[i] == 1) {
                    System.out.println(i + " occurs 1 time");
                } else {
                    System.out.println(i + " occurs " + counts[i] + " times");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] counts = new int[101];

        readInput(counts);
        displayCounts(counts);
    }
}

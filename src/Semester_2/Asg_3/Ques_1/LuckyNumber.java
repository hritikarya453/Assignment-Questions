package Semester_2.Asg_3.Ques_1;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your lucky number: ");
            int num = Integer.parseInt(sc.nextLine());

            // Treat negative number as NumberFormatException
            if (num < 0) {
                throw new NumberFormatException("Negative number not allowed");
            }

            System.out.println("Your lucky number is: " + num);

        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid input! " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: Something went wrong.");
        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}
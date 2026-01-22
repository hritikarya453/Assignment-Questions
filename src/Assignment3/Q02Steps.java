package Assignment3;


import java.util.Scanner;

public class Q02Steps{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of steps walked today: ");
        int s = sc.nextInt();

        if (s >= 10000) {
            System.out.println("Good job! You are active today");
        } else {
            System.out.println("You need to walk more for good health");
        }
    }
}

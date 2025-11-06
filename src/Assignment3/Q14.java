package Assignment3;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 12, min = 1;
        int a = (int) (Math.random() * (max - min + 1)) + min;

        switch (a) {
            case 1:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: January");
                break;
            case 2:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: February");
                break;
            case 3:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: March");
                break;
            case 4:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: April");
                break;
            case 5:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: May");
                break;
            case 6:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: June");
                break;
            case 7:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: July");
                break;
            case 8:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: August");
                break;
            case 9:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: September");
                break;
            case 10:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: October");
                break;
            case 11:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: November");
                break;
            case 12:
                System.out.println("Randomly generated number:\n " + a + " Corresponding month: December");
                break;
        }
    }
}
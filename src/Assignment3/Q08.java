package Assignment3;

import java.util.*;
public class Q08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unit = in.nextInt();
        double rate;
        if (unit <= 50)
            rate = unit * 3.00;
        else if (unit <= 200)
            rate = 50 * 3.00 + (unit - 50) * 4.80;
        else if (unit <= 400)
            rate = 50 * 3.00 + 150 * 4.80 + (unit - 200) * 5.80;
        else
            rate = 50 * 3.00 + 150 * 4.80 + 200 * 5.80 + (unit - 400) * 6.20;
        System.out.println("Do you want to pay your bill online? (Y/N): ");
        char a = in.next().toUpperCase().charAt(0);
        //or
        // char a = Character.toUpperCase(in.next().charAt(0));

        switch (a) {
            case 'Y':
                double disc = 0.03 * rate;
                double amount = rate - disc;
                System.out.println("You will get a total dicount of :" + disc);
                System.out.println("Total amount after discount is :" + amount);
                break;
            case 'N':
                System.out.println("You will get no discount. \n You have to pay :"+rate);
                break;
            default:
                System.out.println("Invalid Input");

        }
    }
}

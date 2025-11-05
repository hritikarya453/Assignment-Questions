package Assignment3;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int y=in.nextInt();
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    System.out.println("leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            }
            else {
                System.out.println("leap year");
            }
        }
        else {
            System.out.println("not a leap year");
        }
    }
}

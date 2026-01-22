//Write a Java Program to input the age of a person and check if the age of the person
//is greater than or equal to 18 then print the message:

//       “You are eligible to cast your vote”.
//Sample Run:
//Enter the age of the person:
//        25
//You are eligible to cast your vote

package Assignment3;

import java.util.Scanner;

public class Q01Vote{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int a = in.nextInt();
        // Check eligibility
        if (a >= 18) {
            System.out.println("You are eligible to cast your vote");
        }
    }
}




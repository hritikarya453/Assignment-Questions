//
//4.  Write a Java program that generates a random integer number between 1 and 10.
//
//The program should repeatedly ask the user to guess the number until the correct guess
//is made.
//
//• If the user’s guess is greater than the random number, display the message:
//"Too high, try again."
//• If the user’s guess is less than the random number, display the message:
//"Too low, try again."
//• If the user guesses correctly, display the message:
//"Good guess!"
//
//The program must use a do-while loop to continue prompting the user until the correct
//number is guessed

package Assignment4;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 10, min = 1;
        int cg = (int) (Math.random() * (max - min + 1)) + min;
        int ug;
        System.out.println("Guess the number between 1 and 10!");
        do {
            System.out.println("Enter you guess");
            ug = in.nextInt();
            if (ug > cg) {
                System.out.println("Too high, try again.");
            } else if (ug < cg) {
                System.out.println("Too low, try again.");
            } else{
                System.out.println("Good guess!" );
            }
        }while(ug!=cg);
    }
}

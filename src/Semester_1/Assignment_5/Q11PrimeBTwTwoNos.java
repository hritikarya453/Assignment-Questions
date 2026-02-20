package Semester_1.Assignment_5;
import java.util.Scanner;

public class Q11PrimeBTwTwoNos{
    // Method to check if a number is prime
    static boolean isPrime(int n) {
     if(n<=1){
         return false;
     }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
            return true;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = in.nextInt();

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        for (int i = m; i <=n ; i++) {
            if(isPrime(i)){
                System.out.println(i);;
            }

        }
    }
}
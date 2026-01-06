//Write a Java program that creates an integer array of size 10 and fills it with random
//values between 2 and 30. Use methods to perform the following tasks:
//
//        1. A method to generate and store random values in the array:
//public static void fillArray(int[] arr);
//CO4
//2. A method to print the array elements:
//public static void printArray(int[] arr);
//
//3. A method to check whether a number is prime:
//public static boolean isPrime(int num);
//
//4. A method to count the number of prime numbers in the array:
//public static int countPrimes(int[] arr);
//Use these methods in the main method to display the array and the total count of
//        prime numbers it contains.

package Assignment_7;

public class Q_08_Prime{
    public static void fillArray(int[] arr) {
        System.out.println("Random Values between 2 to 30:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 29) + 2; // 2 to 30
        }
    }

    public static void printArray(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int e : arr) {
            if (isPrime(e))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr);
        printArray(arr);
        System.out.println("Number of prime numbers: " + countPrimes(arr));
    }
}

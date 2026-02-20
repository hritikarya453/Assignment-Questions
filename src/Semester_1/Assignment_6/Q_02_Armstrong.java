package Semester_1.Assignment_6;

public class Q_02_Armstrong {
    // Method to count digits
    public static int countDigit(int n) {
//        n = Math.abs(n); // handle negative numbers
//        if (n == 0) return 1;

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    // Method to calculate a^b (power)
    public static int power(int a, int b) {
        int prod = 1;
        for (int i = 1; i <= b; i++) {
            prod *= a;
        }
        return prod;
    }

    public static boolean isArmstrong(int n){
        int totalDig=countDigit(n);
        int og=n;
        int sum=0;

        while (n>0) {
            int digit = n % 10;
            sum+=power(digit,totalDig);
            n/=10;
        }
        return og==sum;
    }
    public static void main(String[] args) {
        int c = 0;
        System.out.println("Armstrong numbers between 100 and 10,000:");
        for (int i = 100; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                c++;
            }
        }
        System.out.println("\n\nTotal Armstrong numbers found: " + c);
    }
}

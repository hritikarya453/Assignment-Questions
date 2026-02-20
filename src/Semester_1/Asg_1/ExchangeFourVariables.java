package Semester_1.Asg_1;

public class ExchangeFourVariables {
    public static void main(String[] args) {
        // Initial values
        int W = 1, G = 2, K = 3, A = 4;

        // Display original values
        System.out.println("Before interchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

        // (a) Using an extra variable D
        int D = W;
        W = G;
        G = K;
        K = A;
        A = D;

        System.out.println("\nAfter interchange (using extra variable):");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

        // Reset values for next method
        W = 1; G = 2; K = 3; A = 4;

        // (b) Without using extra variable
        W = W + G + K + A; // W gets original sum of all
        A = W - G - K - A; // A gets original W
        K = W - (G + K + A); // K gets original A
        G = W - (G + K + A); // G gets original K
        W = W - (G + K + A); // W gets original G

        System.out.println("\nAfter interchange (without extra variable):");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);
    }
}
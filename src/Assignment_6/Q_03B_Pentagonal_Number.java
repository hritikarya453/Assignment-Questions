package Assignment_6;


public class Q_03B_Pentagonal_Number {

    // method to return nth pentagonal number
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("First 100 Pentagonal Numbers:\n");
        for (int i = 1; i <= 100; i++) {
            // System.out.print(getPentagonalNumber(i)+"\t\t");
            System.out.printf("%-10d", getPentagonalNumber(i));  // formatting
            // System.out.printf("%8d", 25);  right-aligned in 8 spaces
            //System.out.printf("%-8d", 25);  left-aligned in 8 spaces

            // print 10 numbers per line
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}


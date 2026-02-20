package Semester_2.Asg_1;

public class Q_15_B_Matrix01 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        // Fill matrix with random 0s and 1s
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        // Print matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }

        // Find row with most 1s
        int maxRowIndex = 0;
        int maxRowCount = 0;

        for (int i = 0; i < 4; i++) {
            int rowCount = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
        }

        // Find column with most 1s
        int maxColIndex = 0;
        int maxColCount = 0;

        for (int i = 0; i < 4; i++) {
            int colCount = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[j][i] == 1) {
                    colCount++;
                }
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxColIndex = i;
            }
        }

        // Output results
        System.out.println("\nThe largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}

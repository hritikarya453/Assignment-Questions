package Semester_2.Asg_1;

public class Q_15_Matrix_Fill_0_1 {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];

        int maxRowIndex = -1;
        int maxRowCount = 0;

        for (int i = 0; i < 4 ; i++) {
            int rowCount = 0;
            for (int j = 0; j < 4 ; j++) {
                arr[i][j]= (int)(Math.random()*(2));

                if (arr[i][j]==1){
                    rowCount++;
                }
            } // j loop ends

            if (rowCount>maxRowCount){
                maxRowCount=rowCount;
                maxRowIndex = i;
            }
        }

        int maxColumnIndex = -1;
        int maxColumnCount = 0;

        System.out.println("Matrix: ");
        for (int i = 0; i < 4; i++) {
            int columnCount=0;
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "   ");
                if(arr[j][i]==1){
                    columnCount++;
                }
            }
            if (columnCount>maxColumnCount){
                maxColumnCount=columnCount;
                maxColumnIndex = i;
            }
            System.out.println();
        }
        System.out.println("\nThe largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColumnIndex);
    }
}

package Assignment_7;

public class Practice {
    public static void BubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            // outside j loop
            if (!isSwapped) {
                break;
            }
        }
    }

    public static int[] Eliminate_Duplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }
        int[] res = new int[index];
        for (int i = 0; i < index; i++) {
            res[i] = temp[i];
        }
        return res;
    }

    public static void ShiftingZeroesForward(int[] arr) {

        int index = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }
        while ((index >= 0)) {
            arr[index--] = 0;
        }
    }

    public static void rotateArrayClockwise(int[] arr) {
        int n = arr.length - 1;
        int temp = arr[n];
        for (int i = n - 1; i >= 0; i++) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }

    public static void rotateArrayAntiClockwise(int[] arr) {
        for (int k = 0; k <= 3; k++) {
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;
        }
    }
    public static String dectobin(int decimal){
        String bin = "";
        while (decimal > 0){
            int digit = decimal % 2;
            bin = digit + bin;
            decimal /= 2;
        }
        return bin;
    }

    public static String dectooctal(int decimal){
        String octal = "";
        while (decimal > 0){
            int digit = decimal % 8;
            octal = digit + octal;
            decimal /= 8;
        }
        return octal;
    }
}
package JavaSetPYQ;

import java.util.Arrays;
import java.util.Scanner;

public class SwapConsecutive {
    public static void main() {
        Scanner in = new Scanner(System.in);

        int[] arr = {0, 1, 2, 3, 4, 5, 7, 8, 9, 10};

        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

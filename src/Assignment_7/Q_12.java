package Assignment_7;

public class Q_12 {

    // 1. Method to fill array with random values between 50 and 100
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 51) + 50; // 50 to 100
        }
    }

    // 2. Method to print array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 3. Method to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[10];

        fillArray(arr);

        System.out.println("Array before reversal:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Array after reversal:");
        printArray(arr);
    }
}

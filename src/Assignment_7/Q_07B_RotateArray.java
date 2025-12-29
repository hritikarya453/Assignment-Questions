package Assignment_7;

public class Q_07B_RotateArray {

    public static void rotateCW(int[] arr) {


        for (int k = 0; k <3 ; k++) {
            int n = arr.length - 1;
            int last = arr[n];

            for (int i = n; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
    }
    public static void rotateACW(int[] arr) {


        for (int k = 0; k <1; k++) {
            int n = arr.length - 1;
            int first = arr[0];

            for (int i = 0; i <= n-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        rotateACW(arr);

        System.out.print("Rotated Array [ ");
        for (int e : arr) {  // e is element value not index
            System.out.print(e + " ");
        }
        System.out.println("]");
    }
}

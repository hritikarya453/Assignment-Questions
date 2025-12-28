package Assignment_7;

public class Q_07B_RotateArray {

    public static void rotateCW(int[] arr) {
        int n = arr.length - 1;
        int last = arr[n];

        for (int i = n; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        rotateCW(arr);

        System.out.print("Rotated Array [ ");
        for (int e : arr) {  // e is element value not index
            System.out.print(e + " ");
        }
        System.out.println("]");
    }
}

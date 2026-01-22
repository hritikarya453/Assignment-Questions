package Assignment_7;

public class DeleteElement{
    public static void delete(int[] arr, int ele) {
        int index = -1;

        // find element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                index = i;
                break;   // first occurrence
            }
        }

        // if element not found
        if (index == -1)
            return;

        // shift elements
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

}

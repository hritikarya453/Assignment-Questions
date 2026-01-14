package Assignment_7;

public class Q_10B {

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate) {
                temp[index++] = list[i];
            }

        }

        int[] result =new int[index];
        for (int i = 0; i < index ; i++) {
            result[i]= temp[i];
        }
        return result;
    }
}

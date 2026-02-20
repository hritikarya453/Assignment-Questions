public class demo {

    static void modifyArray(int n) {
        n=n*2;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        System.out.println("Before method:");
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

        for (int i = 0; i < 3; i++) {
            modifyArray(numbers[i]);
        }


        System.out.println("After method:");
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}

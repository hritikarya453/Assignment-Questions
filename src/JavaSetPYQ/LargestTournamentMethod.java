package JavaSetPYQ;
//
//import java.util.Scanner;
//
//public class LargestTournamentMethod {
//
//    // Method to find maximum element and count comparisons
//    public static int[] findMax(int[] arr) {
//
//        //int comparisons = 0;
//        int end = arr.length;
//
//        // Repeat until only one element remains
//        while (end > 1) {
//            int index = 0;
//
//            // Compare consecutive elements
//            for (int i = 0; i < end - 1; i += 2) {
//            //    comparisons++;
//                if (arr[i] > arr[i + 1]) {
//                    arr[index++] = arr[i];
//                } else {
//                    arr[index++] = arr[i + 1];
//                }
//            }
//
//            // If odd number of elements, carry last element forward
//            if (end % 2 == 1) {
//                arr[index++] = arr[end - 1];
//            }
//
//            // Reduce effective array size
//            end = index;
//        }
//
//        // Return maximum and number of comparisons
//        return new int[]{arr[0], comparisons};
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // (a) Create array
//        System.out.print("Enter number of elements: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        // (b) Input values
//        System.out.println("Enter elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // (c) Find largest element
//        int[] result = findMax(arr);
//
//        // (d) Output results
//        System.out.println("Largest element: " + result[0]);
//        System.out.println("Number of comparisons: " + result[1]);
//    }
//
//    public static class Craps_Game {
//        public static void main(String[] args) {
//
//            Scanner in = new Scanner(System.in);
//
//            System.out.print("Enter first die value: ");
//            int die1 = in.nextInt();
//
//            System.out.print("Enter second die value: ");
//            int die2 = in.nextInt();
//
//            int sum = die1 + die2;
//            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
//
//            switch (sum) {
//                case 2:
//                case 3:
//                case 12:
//                    System.out.println("You lose");
//                    break;
//
//                case 7:
//                case 11:
//                    System.out.println("You win");
//                    break;
//
//                default:
//                    System.out.println("point is " + sum);
//
//                    while (true) {
//                        System.out.print("Enter first die value: ");
//                        int dieA = in.nextInt();
//
//                        System.out.print("Enter second die value: ");
//                        int dieB = in.nextInt();
//
//                        int sum2 = dieA + dieB;
//                        System.out.println("You rolled " + dieA + " + " + dieB + " = " + sum2);
//
//                        if (sum2 == 7) {
//                            System.out.println("You lose");
//                            break;
//                        }
//                        else if (sum2 == sum) {
//                            System.out.println("You win");
//                            break;
//                        }
//                    }
//            }
//            in.close();
//        }
//    }
//}

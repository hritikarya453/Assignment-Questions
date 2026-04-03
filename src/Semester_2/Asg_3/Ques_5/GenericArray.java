package Semester_2.Asg_3.Ques_5;

public class GenericArray {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"A", "B", "C"};
        Double[] dblArray = {1.1, 2.2, 3.3};

        printArray(intArray);
        printArray(strArray);
        printArray(dblArray);
    }
}
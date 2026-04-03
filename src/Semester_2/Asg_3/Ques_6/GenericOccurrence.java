package Semester_2.Asg_3.Ques_6;

public class GenericOccurrence {

    public static <T> int count(T[] array, T item) {
        int cnt = 0;
        for (T element : array) {
            if (element.equals(item)) {
                cnt++;
            }
        }
        return cnt;
    }

//    public static void main(String[] args) {
//
//        Integer[] intArr = {1, 2, 3, 2, 2};
//        String[] strArr = {"A", "B", "A", "C"};
//
//        System.out.println(count(intArr, 2));
//        System.out.println(count(strArr, "A"));
//    }
}
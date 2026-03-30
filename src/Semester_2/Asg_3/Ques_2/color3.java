package Semester_2.Asg_3.Ques_2;

public class color3 {
    public static void main(String[] args) {

        try {
            String[] colors = null;
            System.out.println(colors[0]);   // NullPointerException

            String[] arr = {"Red", "Blue"};
            System.out.println(arr[5]);      // ArrayIndexOutOfBoundsException
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error occurred: " + e);
        }

        System.out.println("Program continues...");
    }
}
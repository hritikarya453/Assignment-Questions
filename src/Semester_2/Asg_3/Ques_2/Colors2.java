package Semester_2.Asg_3.Ques_2;

public class Colors2 {
    public static void main(String[] args) {

        // --------- Case 1: NullPointerException ----------
        try {
            String[] colors = null;  // array not initialized
            System.out.println(colors[0]); // causes NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("Error: Array is not initialized!");
        }

        // --------- Case 2: ArrayIndexOutOfBoundsException ----------
        try {
            String[] colors = {"Red", "Blue", "Green"};
            System.out.println(colors[5]); // invalid index
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range!");
        }

        System.out.println("Program continues...");
    }
}
package Semester_2.Asg_3.Ques_2;
public class FavoriteColors {
    public static void main(String[] args) {

        // Assigning favorite colors
        String[] colors = {"Red", "Blue", "Green"};

        try {

            // Accessing elements
            System.out.println("First color: " + colors[0]);

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Invalid access: " + colors[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range!");
        }
        catch (NullPointerException e) {
            System.out.println("Error: Array is not initialized!");
        }

        System.out.println("Program continues...");
    }
}
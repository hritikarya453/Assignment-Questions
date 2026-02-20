package Semester_1.Assignment3;

public class Q14_1 {
    public static void main(String[] args) {
        // Generate random number between 1 and 12 using Math.random()
        int monthNumber = (int)(Math.random() * 12) + 1;

        String monthName;
        System.out.println("Randomly generated number: " + monthNumber);

        // Map number to month name
        switch (monthNumber) {
            case 1:  monthName = "January"; break;
            case 2:  monthName = "February"; break;
            case 3:  monthName = "March"; break;
            case 4:  monthName = "April"; break;
            case 5:  monthName = "May"; break;
            case 6:  monthName = "June"; break;
            case 7:  monthName = "July"; break;
            case 8:  monthName = "August"; break;
            case 9:  monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid"; // Should never happen
        }

        // Display result

        System.out.println("Corresponding month: " + monthName);
    }
}

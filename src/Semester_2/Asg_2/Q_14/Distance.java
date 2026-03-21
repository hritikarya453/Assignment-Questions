package Semester_2.Asg_2.Q_14;



public class Distance {
    int feet;
    int inches;

    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    void displayDistance() {
        System.out.print("The Distance is " + feet + "' " + inches + "\" ");
    }
}
package Semester_2.Asg_2.Q_15;


public class PointType {
    int x;
    int y;

    // Constructor
    PointType(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Set coordinates
    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display point
    void displayPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    // Get x-coordinate
    int getX() {
        return x;
    }

    // Get y-coordinate
    int getY() {
        return y;
    }
}
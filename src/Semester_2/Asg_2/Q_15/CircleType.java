package Semester_2.Asg_2.Q_15;




public class CircleType extends PointType {
    double radius;

    // Constructor
    CircleType(int x, int y, double r) {
        super(x, y);  // initialize center
        radius = r;
    }

    // Set radius
    void setRadius(double r) {
        radius = r;
    }

    // Display radius
    void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    // Calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Calculate circumference
    double circumference() {
        return 2 * Math.PI * radius;
    }

    // Display full circle info
    void displayCircle() {
        displayPoint(); // center
        displayRadius();
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}
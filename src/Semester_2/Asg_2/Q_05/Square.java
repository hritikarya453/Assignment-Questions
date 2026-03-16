package Semester_2.Asg_2.Q_05;

public class Square extends Shapes{

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side*side;
    }
}

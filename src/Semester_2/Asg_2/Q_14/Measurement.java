package Semester_2.Asg_2.Q_14;



public class Measurement extends Distance {
    double cm;

    Measurement(int f, int i, double centim) {
        super(f, i);
        cm = centim;
    }

    void displayMeasurement() {
        super.displayDistance();
        System.out.print(cm + " cm");
    }
}
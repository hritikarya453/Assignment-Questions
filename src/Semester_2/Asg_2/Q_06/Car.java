package Semester_2.Asg_2.Q_06;

public class Car extends Vehicle{
int carId;
double price;

    public Car(String model, int year, int carId, double price) {
        super(model, year);
        this.carId = carId;
        this.price = price;
    }
    void carDisplay(){
        System.out.println();
    }
}

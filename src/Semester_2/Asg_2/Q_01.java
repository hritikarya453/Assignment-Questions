package Semester_2.Asg_2;
import java.util.Scanner;

class Car {
    // Instance variables
    String model;
    int year;

    // Method to set the details of the car
    public void setDetails(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display the details of the car
    public void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    // Method to compare which car is newer
    public String compareCars(Car otherCar) {
        if (this.year > otherCar.year) {
            return "The " + this.model + " (" + this.year + ") is newer.";
        } else if (this.year < otherCar.year) {
            return "The " + otherCar.model + " (" + otherCar.year + ") is newer.";
        } else {
            return "Both cars are of the same year.";
        }
    }
}

public class Q_01{
    public static void main(String[] args) {
        // Create the first car object and set its details directly
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;

        // Create the second car object and set its details using setDetails()
        Scanner scanner = new Scanner(System.in);
        Car car2 = new Car();

        System.out.print("Enter the model of the second car: ");
        String modelInput = scanner.nextLine();
        System.out.print("Enter the year of the second car: ");
        int yearInput = scanner.nextInt();

        car2.setDetails(modelInput, yearInput);

        // Display details of both cars
        System.out.println("\nCar 1 details:");
        car1.displayDetails();

        System.out.println("\nCar 2 details:");
        car2.displayDetails();

        // Compare and print which car is newer
        System.out.println("\nComparison:");
        System.out.println(car1.compareCars(car2));

        scanner.close();
    }
}
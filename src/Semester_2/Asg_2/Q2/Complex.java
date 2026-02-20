package Semester_2.Asg_2.Q2;

import java.util.Scanner;

public class Complex {

    double real;
    double imag;

    // Method to set data using Scanner
    void setData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part: ");
        real = sc.nextDouble();

        System.out.print("Enter imaginary part: ");
        imag = sc.nextDouble();
    }

    // Method to display
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    // Method to add two complex numbers
    public Complex add(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }
}
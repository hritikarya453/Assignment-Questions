package Semester_2.Asg_2.Q2;

public class TestComplex {

    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();


        System.out.println("Enter first complex number:");
        c1.setData();

        System.out.println("\nEnter second complex number:");
        c2.setData();

        Complex result = c1.add(c1, c2);

        System.out.println("\nFirst Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        System.out.println("Sum of Complex Numbers:");
        result.display();
    }
}
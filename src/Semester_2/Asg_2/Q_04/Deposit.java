package Semester_2.Asg_2.Q_04;

class Deposit {

    // Instance Variables
    long Principal;
    int Time;
    double Rate;
    double Total_amt;

    // Constructor 1: Default Constructor
    Deposit() {
        Principal = 0;
        Time = 0;
        Rate = 0.0;
    }

    // Constructor 2: (long, int, double)
    Deposit(long p, int t, double r) {
        Principal = p;
        Time = t;
        Rate = r;
    }

    // Constructor 3: (long, int)
    Deposit(long p, int t) {
        Principal = p;
        Time = t;
        Rate = 5.0;     // default rate
    }

    // Constructor 4: (long, double)
    Deposit(long p, double r) {
        Principal = p;
        Rate = r;
        Time = 1;      // default time
    }

    // Method to calculate total amount
    void calc_amt() {
        Total_amt = Principal + (Principal * Rate * Time) / 100;
    }

    // Method to display details
    void display() {
        System.out.println("Principal: " + Principal);
        System.out.println("Time: " + Time);
        System.out.println("Rate: " + Rate);
        System.out.println("Total Amount: " + Total_amt);
    }

    // Main method
    public static void main(String[] args) {

        // Using Constructor 1
        Deposit d1 = new Deposit();
        d1.calc_amt();
        d1.display();

        // Using Constructor 2
        Deposit d2 = new Deposit(10000, 2, 7.5);
        d2.calc_amt();
        d2.display();

        // Using Constructor 3
        Deposit d3 = new Deposit(15000, 3);
        d3.calc_amt();
        d3.display();

        // Using Constructor 4
        Deposit d4 = new Deposit(20000, 6.5);
        d4.calc_amt();
        d4.display();
    }
}
package Semester_2.Asg_2.Q_04;

class Deposit_this {

    // Instance Variables
    long Principal;
    int Time;
    double Rate;
    double Total_amt;

    // Constructor 1: Default
    Deposit_this() {
        this.Principal = 0;
        this.Time = 0;
        this.Rate = 0.0;
    }

    // Constructor 2: (long, int, double)
    Deposit_this(long Principal, int Time, double Rate) {
        this.Principal = Principal;
        this.Time = Time;
        this.Rate = Rate;
    }

    // Constructor 3: (long, int)
    Deposit_this(long Principal, int Time) {
        this.Principal = Principal;
        this.Time = Time;
        this.Rate = 5.0;   // default rate
    }

    // Constructor 4: (long, double)
    Deposit_this(long Principal, double Rate) {
        this.Principal = Principal;
        this.Rate = Rate;
        this.Time = 1;     // default time
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
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {

        Deposit_this d1 = new Deposit_this(10000, 2, 7.5);
        d1.calc_amt();
        d1.display();

        Deposit_this d2 = new Deposit_this(15000, 3);
        d2.calc_amt();
        d2.display();

        Deposit_this d3 = new Deposit_this(20000, 6.5);
        d3.calc_amt();
        d3.display();
    }
}
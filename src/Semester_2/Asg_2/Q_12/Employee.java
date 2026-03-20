package Semester_2.Asg_2.Q_12;



class Employee extends Person {
    int Eid;
    double salary;

    // Constructor
    Employee(String name, int age, int Eid, double salary) {
        super(name, age);  // calling base class constructor
        this.Eid = Eid;
        this.salary = salary;
    }

    // Method to display employee details
    void empDisplay() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
}



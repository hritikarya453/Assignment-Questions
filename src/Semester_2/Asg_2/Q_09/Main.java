package Semester_2.Asg_2.Q_09;

class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String n, double s, String d) {
        super(n, s);
        department = d;
    }

    void displayManagerDetails() {
        super.displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Akash", 200000, "IT");
        m1.displayManagerDetails();
    }
}
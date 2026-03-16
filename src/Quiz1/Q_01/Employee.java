package Quiz1.Q_01;

public class Employee {

    String name;
    int employeeId ;
    double salary;

    static int id = 1001;

    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.employeeId=id++;
        totalEmployees++;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + companyName);
    }

    static void displayCompanyInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Hritik Arya", 40000);
        Employee e2 = new Employee("Joy Arya", 90000);
        Employee e3 = new Employee("Max Arya", 15000);

        Employee.displayCompanyInfo();

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();

        e1.companyName = "NASA";

        Employee.displayCompanyInfo();
    }
}
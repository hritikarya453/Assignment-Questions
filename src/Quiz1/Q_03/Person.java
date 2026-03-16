package Quiz1.Q_03;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    int Eid;
    double salary;

    Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    void empDisplay() {

        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp = new Employee("Hritik Arya", 20, 101, 50000);

        emp.empDisplay();
    }
}

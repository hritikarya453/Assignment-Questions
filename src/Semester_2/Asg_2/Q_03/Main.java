package Semester_2.Asg_2.Q_03;
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(101, 500, 2);
        Book b2 = new Book(102, 300, 1);
        Book b3 = new Book(103, 450, 3);
        Book b4 = new Book(104, 250, 4);
        Book b5 = new Book(105, 600, 2);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();

        System.out.println("Final Total Amount Spent: " + Book.totalAmount);
    }
}
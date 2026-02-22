package Semester_2.Asg_2.Q_03;

class Book {

    // Instance variables
    int bookId;
    double price;
    int quantity;

    // Static variable
    static double totalAmount = 0;

    // Parameterized Constructor
    public Book(int bookId, double price, int quantity) {
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;

        // Update totalAmount when object is created
        totalAmount += calculateTotalCost();
    }

    // Method to calculate total cost of a book
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

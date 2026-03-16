package Quiz1.Q_02;

abstract class Shape {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    void displayColor() {
        System.out.println("Color: " + color);
    }
}


class Circle extends Shape {

    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void display() {
        displayColor();
        System.out.println("Area of Circle: " + calculateArea());
    }
}


class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    void display() {
        displayColor();
        System.out.println("Area of Rectangle: " + calculateArea());

    }
}


class Triangle extends Shape {

    double base;
    double height;

    Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }

    void display() {
        displayColor();
        System.out.println("Area of Triangle: " + calculateArea());

    }
}


class ShapeTest {

    public static void main(String[] args) {

        Circle cir = new Circle("Red", 7);
        Rectangle rec = new Rectangle("Blue", 10, 5);
        Triangle tri = new Triangle("Green", 6, 4);

        cir.display();
        rec.display();
        tri.display();
    }
}
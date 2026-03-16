package Semester_2.Asg_2.Q_07_B;

abstract class Shape {

    String color;

    Shape(String color){
        this.color = color;
    }

    abstract double area();

    void display(){
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
    }
}

class Circle extends Shape{

    double radius;

    Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }

    double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(String color,double length,double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    double area(){
        return length * width;
    }
}

public class ShapeTest{

    public static void main(String[] args){

        Shape c1 = new Circle("Yellow",9.4);
        Shape r1 = new Rectangle("Blue",9.4,9.2);

        c1.display();
        System.out.println();
        r1.display();
    }
}
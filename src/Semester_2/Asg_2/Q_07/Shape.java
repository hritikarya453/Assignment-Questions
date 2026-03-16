package Semester_2.Asg_2.Q_07;

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape{
    double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    double area(){
        return Math.PI * radius*radius;
    }
    void display(){
        System.out.println("Colour"+color);
        System.out.println("Area"+area());
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(String c,double l,double w){
        super(c);
        length = l;
        width = w;
    }

    double area(){
        return length*width;
    }
    void display(){
        System.out.println("Colour"+color);
        System.out.println("Area"+area());
    }

}

class ShapeTest{
    public static void main(String[] args) {
        Circle c1 = new Circle("Yellow",9.4);
        Rectangle r1 = new Rectangle("Blue",9.4,9.2);

        c1.display();
        r1.display();
    }
}





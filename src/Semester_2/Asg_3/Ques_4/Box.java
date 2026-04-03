package Semester_2.Asg_3.Ques_4;

public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class Test {
    public static void main(String[] args) {

        // String case
        Box<String> box = new Box<>();
        box.set("Box");
        Box<String> box1 = box;
        Box<String> box2 = box;
        box1.set("Pencil Box");
        System.out.println(box2.get());

        // Integer case
        Box<Integer> intBox = new Box<>();
        intBox.set(4);
        Box<Integer> intBox1 = intBox;
        Box<Integer> intBox2 = intBox;
        intBox1.set(6);
        System.out.println(intBox2.get());

        // Object case
        Box<Object> objBox = new Box<>();
        Box<Object> objBox1 = objBox;
        Box<Object> objBox2 = objBox;

        objBox1.set("Geometry Box");
        System.out.println(objBox2.get());

        objBox1.set(10);
        System.out.println(objBox2.get());
    }
}
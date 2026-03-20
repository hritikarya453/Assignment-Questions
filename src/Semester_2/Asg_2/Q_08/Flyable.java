package Semester_2.Asg_2.Q_08;

interface Flyable {
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable,Swimmable{
    String name;
    Duck(String n){
        name = n;
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    void displayDetails(){
        fly();
        System.out.println("Duck Name: " + name);
        swim();
    }
}

class Main {

    public static void main(String[] args) {

        Duck d = new Duck("Donald");

        d.fly();
        d.swim();
        d.displayDetails();

    }

}
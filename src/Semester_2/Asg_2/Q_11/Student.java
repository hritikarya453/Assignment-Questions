package Semester_2.Asg_2.Q_11;

public class Student {
    String name;
    int roll;
    double DSA_marks;

    void getData(double DSA_marks, String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.DSA_marks = DSA_marks;
    }
    void showData(){
        System.out.println("Name : " +name);
        System.out.println("Roll no : " +roll);
        System.out.println("Dsa_marks : " +DSA_marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
    }

}

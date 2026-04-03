package Semester_2.Asg_3.Ques_3;

public class Student {
    String name;
    int marks;

    public Student(String name, int marks) throws MarksOutOfBoundsException {
        if (marks>100){
            throw new MarksOutOfBoundsException("Marks Can't Be grater than 100 ");
        }
        this.name = name;
        this.marks = marks;
    }
}

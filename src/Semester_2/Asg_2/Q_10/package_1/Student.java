package Semester_2.Asg_2.Q_10.package_1;

import java.util.Scanner;

public class Student {

    String name;
    int roll;

    public void inputDetails(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name of student:");
        name = in.nextLine();

        System.out.println("Enter roll number:");
        roll = in.nextInt();
    }

    public void showDetails(){
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
    }
}
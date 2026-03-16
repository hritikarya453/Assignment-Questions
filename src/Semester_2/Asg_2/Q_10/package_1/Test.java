package Semester_2.Asg_2.Q_10.package_1;

import java.util.Scanner;

public class Test extends Student {

    protected double mark1;
    protected double mark2;

    @Override
    public void inputDetails(){
        super.inputDetails();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Marks 1:");
        mark1 = in.nextDouble();

        System.out.println("Enter Marks 2:");
        mark2 = in.nextDouble();
    }

    @Override
    public void showDetails(){
        super.showDetails();

        System.out.println("Marks 1 : " + mark1);
        System.out.println("Marks 2 : " + mark2);
    }
}
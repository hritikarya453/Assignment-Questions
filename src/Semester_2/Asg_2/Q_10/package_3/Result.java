package Semester_2.Asg_2.Q_10.package_3;

import Semester_2.Asg_2.Q_10.package_1.Test;
import Semester_2.Asg_2.Q_10.package_2.Sports;

public class Result extends Test implements Sports {

    double total;

    public void calculateTotal(){
        total = mark1 + mark2 + score1 + score2;
    }

    public void displayResult(){
        showDetails();
        System.out.println("Sports Score1 : " + score1);
        System.out.println("Sports Score2 : " + score2);
        System.out.println("Grand Total : " + total);
    }

    public static void main(String[] args){

        Result hritik = new Result();

        hritik.inputDetails();
        hritik.calculateTotal();
        hritik.displayResult();
    }
}
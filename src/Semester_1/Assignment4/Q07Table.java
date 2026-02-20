package Semester_1.Assignment4;

import java.util.Scanner;

public class Q07Table {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        int i;
        for ( i = 1; i <= 3; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }

        while(i<=6){
            System.out.println(n+" * "+i+" = "+n*i);
            i++;
        }
        do{
            System.out.println(n+" * "+i+" = "+n*i);
            i++;
        }while(i<=10);
    }
}


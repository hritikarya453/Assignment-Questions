package Semester_1.Assignment_6;

public class Q_07_DaysInYear {
    public static int numberOfDaysInAYear(int year){
        int ly = (year%400==0||(year%4==0)&&(year%100!=0))? 366 : 365;
        return ly;
    }
    public static void main(String[] args) {
            System.out.println("Year\tDays");

            for (int year = 2000; year <= 2020; year++) {
                System.out.println(year + "\t" + numberOfDaysInAYear(year));
            }
        }

}

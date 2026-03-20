package Semester_2.Asg_2.Q_11;

public class TestStudent {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        System.out.println("Enter the detail of each student");
        double max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < 5 ; i++) {
            s[i].getdata();

            if (s[i].Dsa_marks>max){
                max = s[i].Dsa_marks;
                maxIndex = i;
            }

        }
        System.out.println("The student with highest Dsa Marks is ");
         s[maxIndex].showdata();
    }
}

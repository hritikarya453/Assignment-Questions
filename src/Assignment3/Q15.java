package Assignment3;

import java.util.Scanner;

public class Q15 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 for scissor, 1 for rock , 2 for paper :");
        int a = in.nextInt();
        if (a < 0 || a > 2) {
            System.out.println("plz enter only 0,1,2 for scissor, rock, and paper ");
            return;
        }
        int max = 2;
        int min = 0;
        int b = (int) (Math.random() * (max - min + 1)) + min;
        if (b == 0) {
            if (a == b)
                System.out.println("computer is scissor. you are scissor. it's a draw");
            else {
                if (a == 1)
                    System.out.println("computer is scissor. you are rock. you won");
                else
                    System.out.println("computer is scissor. you are paper. you lose");
            }
        } else if (b==1) {
            if(a==b)
                System.out.println("computer is rock. you are rock. it's a draw");
            else {
                if (a == 0)
                    System.out.println("computer is rock. you are scissor. you lose");
                else
                    System.out.println("computer is rock. you are paper. you won");
            }
        }else {
            if (a == b)
                System.out.println("computer is paper. you are paper. it's a draw");
            else {
                if (a == 0)
                    System.out.println("computer is paper. you are scissor. you won");
                else
                    System.out.println("computer is paper. you are rock. you lose");
            }
        }
   }
}

package Assignment3;

import java.util.Scanner;

public class Q_15_ScissorRockPaper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 0 = scissor, 1 = rock, 2 = paper
        int cg = (int)(Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int ug = sc.nextInt();

        String comp = "";
        String user = "";
        String result = "";

        // Assign names
        switch (cg) {
            case 0: comp = "scissor"; break;
            case 1: comp = "rock"; break;
            case 2: comp = "paper"; break;
        }

        switch (ug) {
            case 0: user = "scissor"; break;
            case 1: user = "rock"; break;
            case 2: user = "paper"; break;
        }

        // Game logic
        if (cg == ug) {
            result = "It is a draw";
        }
        else if ((ug == 0 && cg == 2) ||
                (ug == 1 && cg == 0) ||
                (ug == 2 && cg == 1)) {
            result = "You won";
        }
        else {
            result = "You lost";
        }

        // Single output style
        System.out.println("The computer is " + comp +
                ". You are " + user +
                ". " + result);
    }
}

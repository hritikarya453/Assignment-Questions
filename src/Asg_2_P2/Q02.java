package Asg_2_P2;

public class Q02 {
   public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Please provide exactly two positive integers");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(a<=0||b<=0){
            System.out.println("Both Number should be positive");
            return;
        }
        int c=(int) (Math.pow(a,b));
        System.out.println("Power calculator " +a+" " +b+ " = " +c);
    }



}

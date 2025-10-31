package Asg_2_P2;

public class Q01 {
    static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if(args.length!=2){
            System.out.println("plz provide exactly 2 pos int");
            return;
        }
        boolean c = (a%b==0)||(b%a==0);
        System.out.println(a+"\t"+b+"\tEvenly divides--->"+c);

    }
}

package Asg_2;

public class Q01 {
    static void main(String[] args) {
        if(args.length!=2){
            System.out.println("plz provide exactly 2 pos int");
            return;
        }
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        boolean c = (a%b==0)||(b%a==0);
        System.out.println(a+"\t"+b+"\tEvenly divides--->"+c);

    }
}

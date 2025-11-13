package Asg_2_P2;

public class Q10 {
    static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        System.out.println("Random values\n"+a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
        System.out.printf("Average value: %.2f%n",(a+b+c+d+e)/5.0);
        System.out.println("Minimum value= 2.f" + Math.min(a,Math.min(b,Math.min(c,Math.min(d,e)))));
        System.out.println("Maximum value= " + Math.max(a,Math.max(b,Math.max(c,Math.max(d,e)))));
    }
}

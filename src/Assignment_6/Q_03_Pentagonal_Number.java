package Assignment_6;

public class Q_03_Pentagonal_Number {
    public static int getPentagonalNumber(int n){
      int num = n*((3*n-1)/2);
      return num;
    }
    public static void main(String[] args) {
        int n = 1;
        int c=0;
        System.out.println("The pentagonal numbers are :");
        do {
            int pn = getPentagonalNumber(n);
            if(pn!=Integer.MIN_VALUE){
                System.out.print(pn+"\t");
                c++;
                if(c%10==0)
                    System.out.println();
            }
          n++;
        }while(c<100);
    }
}

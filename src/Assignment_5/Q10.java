package Assignment_5;

public class Q10 {
    public static void main(String[] args) {
        int n =5;

        for (int i = 1; i <=n ; i++) {
            for (int j = 5; j >=1 ; j--) {
                if (j == i){
                    System.out.print("* ");
                }
                else {
                    System.out.print(j+" " );
                }
            }
            System.out.println();
        }
    }
}

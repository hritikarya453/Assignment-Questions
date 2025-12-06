package Assignment_5;

public class PatternDisplay {
    public static void main(String[] args) {
        int n = 5;
        int c=1;
        for (int i = n; i >=1 ; i--) {
            for (int j = i; j >=1; j--) {
                if (j == c)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            c++;
            for (int k = n-i; k <=n ; k--) {
                System.out.print(k);

            }
            System.out.println();

        }
    }
}
package Assignment_7;

public class OctToDec {
    static int octToDec(int oct){
        int dec = 0;
        int i = 0;
        while(oct>0){
            int rem = oct%10;
            dec =   rem* (int) Math.pow(8,i++) + dec  ;
            oct/=10;
        }
        return dec;
    }

    static void main(String[] args) {

    }
}

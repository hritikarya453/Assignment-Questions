package JavaSetPYQ;

public class EliminateDuplicate {
    public static void eliminateDuplicate(int [] arr){
        int[] temp=new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate= false;
            for (int j = 0; j < index; j++) {
               if (arr[i]==temp[j]) {
                   isDuplicate = true;
                   break;
               }
            }
            if(!isDuplicate){
               temp[index++]=arr[i];
            }
        }
    }
    public static void main(String[] args) {

    }
}

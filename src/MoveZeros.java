import java.util.Arrays;

public class MoveZeros {
    public static void moveZero(int[] ar){
        int j=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=0){
                int t=ar[i];
                ar[i]=ar[j];
                ar[j]=t;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZero(arr);
        System.out.print(Arrays.toString(arr));
    }
}

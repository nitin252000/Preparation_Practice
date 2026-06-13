import java.util.Arrays;

public class maxSum {
    //Brute Force
    public static int maxSubaraySum(int [] arr,int k){
       /* //Brute Force
       int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            maxsum=Math.max(maxsum,sum);//complexity-0(n*K)

        }*/
        //optimsed approach
        //calculate sum of First k elements
        int windowsum=0;
        //firstwindow
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int maxsum=windowsum;
        //Slide The Window->Remove the element going out and add the elements going in
        //Track sum
        for(int i=k;i<arr.length;i++){
            windowsum=windowsum-arr[i-k]+arr[i];
            maxsum=Math.max(maxsum,windowsum);
        }


        return maxsum;

    }
    public static void main(String[] args) {
       int [] arr = {2, 3, 5, 2, 9, 7, 1};
        int k = 3;

        System.out.print(maxSubaraySum(arr,k));
    }
}

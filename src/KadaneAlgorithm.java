public class KadaneAlgorithm {
    public static int maxSubArraySum(int [] ar){
        int csum=ar[0];
        int msum=ar[0];
        for(int i=1;i<ar.length;i++){
            csum=Math.max(ar[i],ar[i]+csum);
            msum=Math.max(csum,msum);
        }
        return msum;
    }


        public static void main(String[] args) {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

            System.out.println(maxSubArraySum(arr));
    }
}

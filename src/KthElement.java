import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthElement {
    public static int largest(int [] ar,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int arr:ar){
            pq.offer(arr);
            if(pq.size()>k){
                pq.poll();
            }

        }return pq.peek();
    }
    public static int smallest(int [] ar,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int arr:ar){
            pq.offer(arr);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        /*Arrays.sort(arr);
        int smallest=arr[k-1];
        int largest=arr[arr.length-k];*/
       System.out.println("Kth Smallest "+smallest(arr,k));
        System.out.println("Kth Largest "+largest(arr,k));

    }
}

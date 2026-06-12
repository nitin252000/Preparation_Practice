import java.util.HashMap;

public class TwoSum {
    public int[]  CheckSum(int[] ar,int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0;i<ar.length;i++){
          int com=target-ar[i];
          if(map.containsKey(com)){
              System.out.println(map.get(i)+" "+com);
          }
          map.put(ar[i],i);
      }return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int[] arr = {2,3,4,7,11,15};
        int target = 10;
        twoSum.CheckSum(arr,target);
    }
    }


import java.util.*;


public class Solution {
    public int solve(ArrayList<Integer> A) {
       HashMap<Long,Integer> sumFirstIndex=new HashMap<>();
        long sum=0;
        int length=0;
        for (int index = 0; index < A.size(); index++) {
            sum+=A.get(index);
            if (sumFirstIndex.containsKey(sum)) {
                length=Math.max(length,index-sumFirstIndex.get(sum));
            }else if(sum==0){
                length=Math.max(length,index+1);
            }else
            {
                sumFirstIndex.put(sum, index);
            }
        }
        return length;
    }
}

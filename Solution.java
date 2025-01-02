import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Long,Integer> sumFreqMap= new HashMap<>();
        // if(A.size()==1 && A.get(0)==0) return 1;
        long sum=0;
        long count=0;
        long MOD=1000000007;
        for (int i = 0; i < A.size(); i++) {
            sum+=A.get(i);
            if (sum==0)count++;
            if (sumFreqMap.containsKey(sum)) {
                count+=sumFreqMap.get(sum);
            }
            sumFreqMap.put(sum, sumFreqMap.getOrDefault(sum, 0)+1);
        }
        return (int) (count%MOD);
    }
}

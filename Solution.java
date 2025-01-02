import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        long mod = 1000000007;
        long count = 0;
        HashMap<Integer, Integer> complementFreq = new HashMap<>();
        
        for (int i = 0; i < A.size(); i++) {
            int current = A.get(i);
            int complement1 = current - B;
            int complement2 = current + B;
            
            count += complementFreq.getOrDefault(complement1, 0);
            count += complementFreq.getOrDefault(complement2, 0);
            
            complementFreq.put(current, complementFreq.getOrDefault(current, 0) + 1);
        }
        
        return (int)(count % mod);
    }
}

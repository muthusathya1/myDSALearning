import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : A) {
            if (freq.containsKey(num)) {
                if (freq.get(num) == 1) {
                    count--;
                }
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
                count++;
            }
        }

        return count;
    }
}
                        
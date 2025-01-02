import java.util.*;

public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        Set<Integer> complement = new HashSet<>();
        for (int num : B) {
            if (complement.contains(num)) {
                return 1;
            }
            complement.add(A - num);
        }
        return 0;
    }
}

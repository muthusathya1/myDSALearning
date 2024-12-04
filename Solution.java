import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A,Collections.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i)==i) {
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solve(new ArrayList<>(List.of(1,2,3,4,5))));
    }
}
    
import java.util.*;
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> complement=new HashSet<>();
        for (int index = 0; index < A.size(); index++) {
            int current=A.get(index);
            int complement1= current-B;
            int complement2= B+current;
            if (complement.contains(complement1) || complement.contains(complement2)) {
                return 1;
            }
            complement.add(current);
        }

        return 0;
    }
}

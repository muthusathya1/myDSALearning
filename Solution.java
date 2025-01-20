import java.util.*;
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
         HashSet<Integer> set=new HashSet<>();
        int N=A.size();
        int count=0;
        for(int i=0;i<N;i++){
            if(set.contains(A.get(i)^B)) count++;
            set.add(A.get(i));
        }
        return count;
    }
}

// 1 1 0
// 0 1 1
// 1 0 1
// 0 0 0

// A ^ C = B

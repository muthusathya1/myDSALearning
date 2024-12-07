import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        int dif = A.get(1) - A.get(0);
        int ans = 1;
        for(int i = 1; i < n; i++){
            if(A.get(i) - A.get(i-1) != dif){
                ans = 0;
                break;
            }
        }
        return ans;
    }
}
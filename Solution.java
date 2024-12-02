import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A,Collections.reverseOrder());
        int minCost=0;
        int curCost=0;
        for (int i = 0; i < A.size(); i++) {
            curCost+=A.get(i);
        }
        for (int i = 0; i < A.size(); i++) {
            minCost+=curCost;
            curCost-=A.get(i);
        }
        return minCost;
    }
    public static void main(String[] args) {
    }
}

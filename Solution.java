import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xorSum=0;
        for (int i = 0; i < A.size(); i++) {
            xorSum^=A.get(i);
        }
        int isSetBit=0;
        while (true) {
           int isSet=xorSum&(1<<isSetBit);
            if (isSet!=0) break;
            isSetBit++;
        }
        int groupOne=0;
        int groupTwo=0;
        for (int i = 0; i < A.size(); i++) {
            if ((A.get(i)&1<<isSetBit)==1) {
                groupOne^=A.get(i);
            }else{
                groupTwo^=A.get(i);
            }
        }
        return new ArrayList<>(Arrays.asList(Math.max(groupTwo, groupOne),Math.min(groupTwo, groupOne)))
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> ans = solution.solve(new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 4)));
        System.out.println(ans);
    }
}

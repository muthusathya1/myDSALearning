import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
       ArrayList<Integer> highestFromLeft=new ArrayList<>();
       ArrayList<Integer> highestFromRight=new ArrayList<>();
        int maxLeft=A.get(0);
        highestFromLeft.add(maxLeft);
       for (int i = 1; i < A.size(); i++) {
        maxLeft=Math.max(maxLeft, A.get(i));
        highestFromLeft.add(maxLeft);
       }
       int maxRight=A.get(A.size()-1);
       highestFromRight.add(maxRight);
       for (int i = A.size()-2; i >=0; i--) {
        maxRight=Math.max(maxRight, A.get(i));
        highestFromRight.add(maxRight);
       }
       Collections.reverse(highestFromRight);
       int rainWaterTrapped=0;
       for (int i = 1; i < A.size()-1; i++) {
        rainWaterTrapped+=Math.min(highestFromLeft.get(i), highestFromRight.get(i))-A.get(i);
       }
       return rainWaterTrapped;
    }
}

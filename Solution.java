import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int N=A.size();
        int ans=0;
        for (int i = 31; i >=0; i--) {
            int setBits=0;
            for (Integer integer : A) {
                if (isSetBit(integer,i)) {
                    setBits++;
                }
            }
            if (setBits%3!=0) {
                ans+=Math.pow(2, i);
            }
        }
        return ans;
        
    }
    boolean isSetBit(int number, int position){
        if ((number&1<<position)!=0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Solution solution =new Solution();
        System.out.println(solution.singleNumber(new ArrayList<>(Arrays.asList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1))));
    }
}

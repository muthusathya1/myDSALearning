import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
             Collections.sort(A, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                String a=String.valueOf(o1);
                String b=String.valueOf(o2);
                return (b+""+a).compareTo(a+""+b);
            }
            
        });
        StringBuilder ans=new StringBuilder();
        A.forEach(ans::append);
        
        if (ans.charAt(0)=='0') {
            return "0";
        }

        return ans.toString();
    }
}


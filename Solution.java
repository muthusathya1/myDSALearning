import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A , new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1%100-o1%10)- (o2%100-o2%10);
            }

        }.thenComparing(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
            
        }) 
        );
        return A;
    }
}

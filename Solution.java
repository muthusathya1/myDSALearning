import java.util.*;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return countFactors(o1)-countFactors(o2);
            }

        }.thenComparing(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                    return o1-o2;
            }
            
        }));

        return A;
        
    }
    public Integer countFactors(int number){
        int count=0;
        for (int i = 1; i*i <=number; i++) {
            if (number%i==0) {
                if (number/i==i) {
                    count++;                            
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countFactors(10));
    }
}

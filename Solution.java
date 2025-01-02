import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    // Do not write code to include libraries, main() function or accept any input from the console.
    // Initialization code is already written and hidden from you. Do not write code for it again.
    public int solve(ArrayList<Integer> A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        HashSet<Integer> sums=new HashSet<>();
        int sum=0;
        for (int i = 0; i < A.size(); i++) {
            sum+=A.get(i);
            if (sum==0 || A.get(i)==0 || sums.contains(sum)) {
                return 1;
            }
            sums.add(sum);
        }
        return 0;
    }
  }
  
import java.util.*;

public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int n=A.size();
        int i=n-2;
        while(i>=0 && A.get(i)>=A.get(i+1)){
            i--;
        }
        if (i>=0) {
            int j=n-1;
            while (A.get(j)<=A.get(i)) {
                j--;
            }
            Collections.swap(A, i, j);
        }
        reverse(A,i+1,n-1);
                return A;
            }
        
            private void reverse(ArrayList<Integer> A, int start, int end) {
                while (start<end) {
                    Collections.swap(A, start++, end--);
                    
                }
            }
}

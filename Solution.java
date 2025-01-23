public class Solution {
    public int solve(int A) {
       return isMagic(A)==1 ? 1:0;
    }
       
    private int isMagic(int A) {
        if (A==0) {
            return 0;
        }
        int sum=A%10+isMagic(A/10);
        while (sum>9) {
            sum=isMagic(sum);
        }
        return sum;
    }  
    
}

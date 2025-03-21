public class Solution {
    public int solve(int A, int B) {
        return powerOf(A, B - 2, B);
    }

    private int powerOf(int A, int power, int M) {
        if (power==0) {
            return 1;
        }
        long P=powerOf(A, power/2, M)%M;
        long X=(P*P)%M;
        if (power%2==0) {
            return (int) (X%M);            
        }else{
            return (int) (((A%M)*(X%M))%M);
        }
    }
}

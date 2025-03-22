public class Solution {
    // Find (A ^ (B!)) % (1e9 + 7)
    public int solve(int A, int B) {
        int mod = 1_0000_0000_7;
        int Bfactorial = factorial(B, mod-1) ;
        int A_B = powerOf(A, Bfactorial, mod) ;
        return (int) (A_B);
    }

    private int powerOf(int A, int power, int M) {
        if (power == 0) {
            return 1;
        }
        long P = powerOf(A, power / 2, M);
        P=(P*P)%M; 
        if (power % 2 == 0) {
            return (int) P;
        } else {
            return (int) ((A * P) % M);
        }
    }

    private int factorial(int A, int M) {
       if(A<2){
            return 1;
        }
    long fact = factorial(A - 1, M);
    return (int) ((fact * A) % M);
    }

}

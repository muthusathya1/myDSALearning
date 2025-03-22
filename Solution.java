public class Solution {
    public int solve(int[] A) {
        long[] freq=new long[1001];
        for (int i = 0; i < A.length; i++) {
            freq[A[i]]++;
        }
        int mod=1000000007;

        long sum=0;

        for (int i = 1; i < freq.length; i++) {
            for (int j = 1; j < freq.length; j++) {
                sum= (sum%mod + ( (i%j)%mod  *  ( (freq[i]%mod) * (freq[j]%mod)  )%mod ) %mod ) %mod;
            }
        }
        return (int) (sum%mod);
    }
}

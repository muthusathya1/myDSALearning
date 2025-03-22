public class Solution {
    public int solve(int[] A, int B) {
        long mod = 1_00_00_00_00_7L;
        long[] freq = new long[B];
        for (int i = 0; i < A.length; i++) {
            freq[A[i] % B]++;
        }
        long count = 0;
        for (int i = 0; i <=B/2; i++) {
            if (i == 0 || i == B - i) {
                count = ((count % mod) + ((((freq[i] % mod) * ((freq[i] - 1) % mod)) / 2) % mod)) % mod;
            } else {
                count = ((count % mod) + (((freq[i] % mod) * (freq[B - i] % mod)) % mod)) % mod;
            }
        }
        return (int) (count % mod);

    }
}

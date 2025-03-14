class Solution {
    public long countPairs(int[] arr, int k) {
        int N=arr.length;
        long[] freq=new long[k];
        long mod=1000000007;
        for (int i = 0; i < N; i++) {
           int remainder=arr[i]%k;
           freq[remainder]=freq[remainder]+1;
        }
        long count=0;
        for (int i = 0; i < freq.length; i++) {
            if (i==0 || (i==k-i)) {
                count+=(freq[i]*(freq[i]-1)/2)%mod;
            }else{
                count+=freq[i]*freq[k-i]%mod;
            }
        }
        return (int) (count%mod);
    }
}
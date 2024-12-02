public class Solution {
    public int solve(int[] A, int B) {
        // long t=1;
        // long ans=0;
        // for(int i=A.length-1;i>=0;i--)
        // {
        // ans=(ans+A[i]*t)%B;
        // t=(t*10)%B;
        // }
        // return (int)ans;
        long ans=0;
        long t=1;
        for (int i = A.length-1; i >= 0; i--) {
            ans= (long) ((ans%B)+ (A[i]*t)%B);
            t*=10;
            t%=B;
        }
        return (int) (ans%B);
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solve(new int[]{4, 3, 5, 3, 5, 3, 2, 1}, 47));
    }
}

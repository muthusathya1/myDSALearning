public class Solution {
    public int solve(int[] A) {
        int N=A.length;
        int ans=0;
        for(int i=0;i<N;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++){
                if(A[j]<A[i]){
                    l++;
                }
            }
            for(int j=N-1;j>i;j--){
                if(A[i]<A[j]){
                    r++;
                }
            }
            ans+=(l*r);
        }
        return ans;
    }
}
    
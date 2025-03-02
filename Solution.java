public class Solution {
    public int solve(int A) {
        int num=A;
        int p=0;
        int ans=0;
        while(num>0){
            if(num%2==0){
            ans+=Math.pow(2,p);
            }
            p++;
            num/=2;
        }
        ans+=Math.pow(2,p);
        return ans;
    }
}

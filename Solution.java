public class Solution {
    public void solve(int A) {
        System.out.print(A+" ");
        if (A==1) return;
        solve(A-1);
    }
    public static void main(String[] args) {
        new Solution().solve(9);
    }
}

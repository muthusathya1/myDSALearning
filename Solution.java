
public class Solution {
    public int solve(int A) {
        if (A==0) {
            return 0;
        }
        return A%10+solve(A/10);
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solve(1234));
    }
}

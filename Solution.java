public class Solution {
    public int solve(String A) {
       return isPalindrome(A,0,A.length()-1);
    }
      
    private int isPalindrome(String A, int i, int j) {
        if (i>=j) {
            return 1;
        }
        if (A.charAt(i)!=A.charAt(j)) {
            return 0;
        }
        return isPalindrome(A, i+1, j-1);
    }
}

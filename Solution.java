public class Solution {
    public int solve(String A) {
        int count=0;
        String word="bob";
        for (int i = 0; i < A.length()-word.length()+1; i++) {
            if (A.charAt(i)==word.charAt(0)) {
                if (A.substring(i,i+word.length()).equals(word)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solve("bobob"));
    }
}

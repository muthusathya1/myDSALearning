public class Solution {
    public int solve(int[][] A) {
        int j=A[0].length-1;
        int ones=0;
        int maxOnes=0;
        int maxRow=-1;
        for (int i = 0; i < A.length; i++) {
            while (j>=0 && A[i][j]==1) {
                ones++;
                j--;
            }
            if(j<0){
                return i;
            }
            if (ones>maxOnes) {
                maxOnes=ones;
                maxRow=i;
            }
        }
        return maxRow;
    }
}

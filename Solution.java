public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
		if (A.length==1) {
			return A[0];
		}
		int sum=0;
		int maxSum=A[0];
		for (int i = 0; i < A.length; i++) {
			sum+=A[i];
			
			maxSum=Math.max(sum, maxSum);
		if (sum<0) {
				sum=0;
			}
        }
		return maxSum;
    }
}

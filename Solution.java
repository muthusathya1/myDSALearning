public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) {
                count++;
            }
        }

        int swaps = 0;
        for (int i = 0; i < count; i++) {
            if (A[i] > B) {
                swaps++;
            }
        }
        int minSwaps = swaps;
        int drop = 0;
        for (int i = count; i < A.length; i++) {
            if (A[drop] > B) {
                swaps--;
            }
            if (A[i] > B) {
                swaps++;
            }
            drop++;
            minSwaps = Math.min(swaps, minSwaps);
        }
        return minSwaps;
    }
}

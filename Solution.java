import java.util.Arrays;

class Solution {
    public int triangularSum(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return nums[0];
        }
        while (nums[1] != -1) {
            for (int i = 0; i < N - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1])%10;
            }
            nums[N - 1] = -1;
            N--;
            System.out.println(Arrays.toString(nums));
        }
        return nums[0];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().triangularSum(new int[] { 1, 2, 3, 4, 5 }));
    }
}
import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int N = nums.length;
        int flag = 0;
        for (int i = N - 1; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                flag = 1;
                int j = N - 1;
                while (nums[j] <= nums[i - 1]) {
                    j--;
                }
                swap(nums, i - 1, j);
                reverse(nums, i);
                break;
            }

        }
        if (flag == 0) {
            reverse(nums, 0);
        }
    }

    private void reverse(int[] nums, int i) {
        int s = i;
        int e = nums.length - 1;
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = new int[] { 1, 1, 5 };
        solution.nextPermutation(nums1);
        System.out.println("{ 1, 1, 5 } = Expected output: [1, 5, 1] " + Arrays.equals(nums1, new int[] { 1, 5, 1 }));
        // Expected output: [1, 5, 1]
        System.out.println(Arrays.toString(nums1));
        int[] nums2 = new int[] { 3, 2, 1 };
        solution.nextPermutation(nums2);
        System.out.println("{ 3, 2, 1 } = Expected output: [1, 2, 3] " + Arrays.equals(nums2, new int[] { 1, 2, 3 }));
        // Expected output: [1, 2, 3]
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = new int[] { 1, 2, 3 };
        solution.nextPermutation(nums3);
        System.out.println("{ 1, 2, 3 } = Expected output: [1, 3, 2] " + Arrays.equals(nums3, new int[] { 1, 3, 2 }));
        // Expected output: [1, 3, 2]
        System.out.println(Arrays.toString(nums3));

        int[] nums4 = new int[] { 1, 3, 2 };
        solution.nextPermutation(nums4);
        System.out.println("{ 1, 3, 2 } = Expected output: [2, 1, 3] " + Arrays.equals(nums4, new int[] { 2, 1, 3 }));
        // Expected output: [2, 1, 3]
        System.out.println(Arrays.toString(nums4));

        int[] nums5 = new int[] { 2, 3, 1 };
        solution.nextPermutation(nums5);
        System.out.println("{ 2, 3, 1 } = Expected output: [3, 1, 2] " + Arrays.equals(nums5, new int[] { 3, 1, 2 }));
        // Expected output: [3, 1, 2]
        System.out.println(Arrays.toString(nums5));

    }
}
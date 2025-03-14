import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int N = nums.length;
        for (int i = N - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int pivot = i;
                int swapIndex = i + 1;
                for (int j = pivot + 1; j < N; j++) {
                    if (nums[j] > nums[pivot] && nums[j] <=nums[swapIndex]) {
                        swapIndex = j;
                    }
                }
                swapElements(nums, pivot, swapIndex);
                reverseSequence(nums, pivot + 1);
                break;
            }
            if (i == 0) {
                reverseSequence(nums, 0);
            }

        }

    }

    private void reverseSequence(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    private void swapElements(int[] nums, int pivot, int swapIndex) {
        int temp = nums[pivot];
        nums[pivot] = nums[swapIndex];
        nums[swapIndex] = temp;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = new int[] { 2,3,1,3,3 };
        solution.nextPermutation(nums1);
        System.out.println("{ 2,3,1,3,3 } = Expected output: [2,3,3,1,3] " + Arrays.equals(nums1, new int[] { 2,3,3,1,3 }));
        // Expected output: [1, 5, 1]
        System.out.println(Arrays.toString(nums1));

        // int[] nums1 = new int[] { 1, 1, 5 };
        // solution.nextPermutation(nums1);
        // System.out.println("{ 1, 1, 5 } = Expected output: [1, 5, 1] " + Arrays.equals(nums1, new int[] { 1, 5, 1 }));
        // // Expected output: [1, 5, 1]
        // System.out.println(Arrays.toString(nums1));
        // int[] nums2 = new int[] { 3, 2, 1 };
        // solution.nextPermutation(nums2);
        // System.out.println("{ 3, 2, 1 } = Expected output: [1, 2, 3] " + Arrays.equals(nums2, new int[] { 1, 2, 3 }));
        // // Expected output: [1, 2, 3]
        // System.out.println(Arrays.toString(nums2));

        // int[] nums3 = new int[] { 1, 2, 3 };
        // solution.nextPermutation(nums3);
        // System.out.println("{ 1, 2, 3 } = Expected output: [1, 3, 2] " + Arrays.equals(nums3, new int[] { 1, 3, 2 }));
        // // Expected output: [1, 3, 2]
        // System.out.println(Arrays.toString(nums3));

        // int[] nums4 = new int[] { 1, 3, 2 };
        // solution.nextPermutation(nums4);
        // System.out.println("{ 1, 3, 2 } = Expected output: [2, 1, 3] " + Arrays.equals(nums4, new int[] { 2, 1, 3 }));
        // // Expected output: [2, 1, 3]
        // System.out.println(Arrays.toString(nums4));

        // int[] nums5 = new int[] { 2, 3, 1 };
        // solution.nextPermutation(nums5);
        // System.out.println("{ 2, 3, 1 } = Expected output: [3, 1, 2] " + Arrays.equals(nums5, new int[] { 3, 1, 2 }));
        // // Expected output: [3, 1, 2]
        // System.out.println(Arrays.toString(nums5));

    }
}
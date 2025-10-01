import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testBuildArray_case1() {
        Solution solution = new Solution();
        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] expected = {4, 5, 0, 1, 2, 3};
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    public void testBuildArray_case2() {
        Solution solution = new Solution();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] expected = {0, 1, 2, 4, 5, 3};
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    public void testBuildArray_case3() {
        Solution solution = new Solution();
        int[] nums = {1, 0};
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    public void testBuildArray_case4() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1, 0};
        int[] expected = {0, 1, 2, 3};
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    public void testBuildArray_case5() {
        Solution solution = new Solution();
        int[] nums = {0};
        int[] expected = {0};
        assertArrayEquals(expected, solution.buildArray(nums));
    }
}
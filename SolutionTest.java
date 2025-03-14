import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testNextPermutation1() {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        solution.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 3, 2 }, nums);
    }

    @Test
    void testNextPermutation2() {
        Solution solution = new Solution();
        int[] nums = { 3, 2, 1 };
        solution.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 2, 3 }, nums);
    }

    @Test
    void testNextPermutation3() {
        Solution solution = new Solution();
        int[] nums = { 1, 1, 5 };
        solution.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 5, 1 }, nums);
    }

    @Test
    void testNextPermutation4() {
        Solution solution = new Solution();
        int[] nums = { 1, 3, 2 };
        solution.nextPermutation(nums);
        assertArrayEquals(new int[] { 2, 1, 3 }, nums);
    }

    @Test
    void testNextPermutation5() {
        Solution solution = new Solution();
        int[] nums = { 2, 3, 1 };
        solution.nextPermutation(nums);
        assertArrayEquals(new int[] { 3, 1, 2 }, nums);
    }
}
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
public class SolutionTest {

    @Test
    public void testBubbleSort() {
       Solution solution=new Solution();
       int[] array=new int[] { 7, 3, 9, 12, 11 };
        Solution.bubbleSort(array);
        assertArrayEquals(array, new int[]{3, 7, 9, 11, 12});
    }
}
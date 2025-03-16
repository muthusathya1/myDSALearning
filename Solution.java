import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        bubbleSort(new int[] { 7, 3, 9, 12, 11 });

    }

    private static void bubbleSort(int[] array) {
        int loops = 0;
        for (int i = 0; i < array.length; i++) {

            boolean swapped = false;
            System.out.println();
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            loops++;
            System.out.println(loops);
        }
        System.out.println(Arrays.toString(array));
    }

}
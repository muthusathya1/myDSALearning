public class Solution {
    public int findAthFibonacci(int A) {
        if (A == 0) {
            return 0;
        }
        if (A == 1) {
            return 1;
        }
        return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findAthFibonacci(4));
        System.out.println(new Solution().findAthFibonacci(0));
    }
}

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

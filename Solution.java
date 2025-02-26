public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > 0 && A.get(i) != i + 1 && A.get(i) - 1 < A.size()) {
                int temp = A.get(A.get(i) - 1);
                A.set(A.get(i) - 1, A.get(i));
                A.set(i, temp);
                if (A.get(i) > 0 && A.get(i) != i + 1 && A.get(i) - 1 < A.size() && A.get(i) != A.get(A.get(i) - 1)) {
                    i--;
                }
            }
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != i + 1) {
                return i + 1;
            }
        }
        return A.size() + 1;
    }
}

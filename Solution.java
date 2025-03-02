import java.util.ArrayList;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        for (int position = 31; position >= 0; position--) {
            int npositionSet = 0;
            for (int i = 0; i < N; i++) {
                if (isSet(A.get(i), position)) {
                    npositionSet++;
                }
                if (npositionSet > 1) {
                    for (int j = 0; j < N; j++) {
                        if (!isSet(A.get(j), position)) {
                            A.set(j, 0);
                        }
                    }
                    break;
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A.get(i) != 0) {
                ans = ans & A.get(i);
            }
        }
        return ans;

    }

    private boolean isSet(int integer, int position) {
        return (integer & 1 << position) != 0 ? true : false;
    }
}

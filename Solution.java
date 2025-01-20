import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    // [ "53..7....",
    // "6..195...",
    // ".98....6.",
    // "8...6...3",
    // "4..8.3..1",
    // "7...2...6",
    // ".6....28.",
    // "...419..5",
    // "....8..79" ]
    public int isValidSudoku(final List<String> A) {
        @SuppressWarnings("unchecked")
        HashSet<Character>[] rows = new HashSet[9];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] columns = new HashSet[9];
        @SuppressWarnings("unchecked")
        HashSet<Character>[][] boxes = new HashSet[3][3];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new HashSet<>();
        }
        for (int i = 0; i < columns.length; i++) {
            columns[i] = new HashSet<>();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxes[i][j] = new HashSet<>();
            }
        }
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).length(); j++) {
                if (A.get(i).charAt(j) != '.') {
                    char a = A.get(i).charAt(j);
                    if (columns[j].contains(a))
                        return 0;
                    columns[j].add(a);
                    if (rows[i].contains(a))
                        return 0;
                    rows[i].add(a);
                    if (boxes[i / 3][j / 3].contains(a))
                        return 0;
                    boxes[i / 3][j / 3].add(a);
                }
            }
        }
        return 1;

    }
}

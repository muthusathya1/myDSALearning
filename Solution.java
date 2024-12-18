import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for (int index = 0; index < B.size(); index++) {
            int rotations=B.get(index)%A.size();
            ArrayList<Integer> arrayList=new ArrayList<>();
            for (int i = rotations; i < A.size(); i++) {
                arrayList.add(A.get(i));
            }
            for (int i = 0; i < rotations; i++) {
                arrayList.add(A.get(i));
            }
            ans.add(arrayList);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans=new Solution()
    }
}

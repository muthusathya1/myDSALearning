import java.util.*;
// Problem Description

// Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.






// If the answer does not exist return an array with a single integer "-1".

// First sub-array means the sub-array for which starting index in minimum.

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        long sum=0;
        HashMap<Long,Integer> prevSum=new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            sum+=A.get(i);
            if (sum == B) {
                ArrayList<Integer> ans = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    ans.add(A.get(j));
                }
                return ans;
            } else if (prevSum.containsKey(sum-B) && prevSum.get(sum-B)<i) {
                  
                 ArrayList<Integer> ans=new ArrayList<>();
                 for (int j = prevSum.get(sum-B)+1; j <= i; j++) {
                    ans.add(A.get(j));
                 }
                 return ans;
            }
            prevSum.put(sum, i);
            
        }
        return new ArrayList<>(Arrays.asList(-1));
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solution.solve(arrayList, 5));
        
        arrayList=new ArrayList<>(Arrays.asList(5, 10, 20, 100, 105));
        System.out.println(solution.solve(arrayList, 110));
    }

}

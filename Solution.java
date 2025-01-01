import java.util.*;

public class Solution {
    public int solve(String A, int B) {
        // Count the frequency of each character in the string
        int cnt[] = new int[26];
        // Store the frequency of each character in an arraylist
        for(int i = 0; i < A.length(); ++i){
            ++cnt[A.charAt(i)-'a'];
        }
        // Sort the arraylist
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < 26; ++i){
            if(cnt[i] > 0){
                C.add(cnt[i]);
            }
        }
        // Sort the arraylist
        Collections.sort(C);
        // Remove the elements from the arraylist until the sum of the elements is less than B
        for(int i = 0; i < C.size(); ++i){
            // If the sum of the elements is less than B, return the number of elements removed
            B -= C.get(i);
            if(B < 0){
                return C.size() - i;
            }
        }
        return 1;
    }
}
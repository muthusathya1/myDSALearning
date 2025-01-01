import java.util.Arrays;

// Problem Description

// You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

// Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.

public class Solution {
    public int solve(String A, String B) {
        if (A.length() != B.length()) {
            return 0;
        }
        
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        
        return Arrays.equals(aArray, bArray) ? 1 : 0;
    }
}
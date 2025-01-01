import java.util.*;

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).length() < minLen) {
                minLen = A.get(i).length();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char c = A.get(0).charAt(i);
            for (int j = 1; j < A.size(); j++) {
                if (A.get(j).charAt(i) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();

    }

public String longestCommonPrefixOptimized(ArrayList<String> A) {
    // Edge case:   If the list is empty, return empty string
    if (A == null || A.size() == 0) return "";
    // Start with the first string as the prefix
    String prefix = A.get(0);
    // For each string in the list
    for (int i = 1; i < A.size(); i++) {
        // While the string does not start with the prefix
        while (A.get(i).indexOf(prefix) != 0) {
            // Remove the last character from the prefix
            prefix = prefix.substring(0, prefix.length() - 1);
            // If the prefix is empty, return empty string
            if (prefix.isEmpty()) return "";
        }
    }
    // Return the prefix
    return prefix;
}

}
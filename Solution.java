import java.util.*;
public class Solution {
    public int solve(ArrayList<String> A, String B) {
        HashMap<Character,Integer> orderMap=new HashMap<>();
        // Lexicographical Order
        for (int i = 0; i < B.length(); i++) {
            orderMap.put(B.charAt(i), i+1);
        }

        for (int i = 1; i < A.size(); i++) {
            // Iterate over words
            String firstString=A.get(i-1);
            String secondString=A.get(i);
            int index=0;
            while (index<Math.min(firstString.length(), secondString.length())) {
                if ( orderMap.get(firstString.charAt(index))< orderMap.get(secondString.charAt(index)) ) {
                    // Goto the next word
                    break;
                }else if ( 
                    orderMap.get(firstString.charAt(index)) == orderMap.get(secondString.charAt(index)) // If both letters are same
                    &&
                    firstString.length() <= secondString.length() // Checking lengths
                    ) {
                    // Goto the next letter
                    index++;
                }else{
                    // Is not in Order
                    return 0;
                }
            }
        }
            // All words are in Order
            return 1;

    }
}

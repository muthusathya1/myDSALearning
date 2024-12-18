import java.util.*;
public class Solution {
    public int solve(String A, int B) {
        int[] freq=new int[26];
        for (int i = 0; i < A.length(); i++) {
            ++freq[A.charAt(i)-'a'];
        }
        // System.out.println(Arrays.toString(freq));
        ArrayList<Integer> uniqList=new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>0) {
                uniqList.add(freq[i]);
            }
        }
        Collections.sort(uniqList);
        // System.out.println(uniqList);
        int allowedCharacters=B;
        for (int i = 0; i < uniqList.size(); i++) {
            allowedCharacters-=uniqList.get(i);
            if (allowedCharacters<0) {
                return uniqList.size()-i;
            }
        }
        
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solve("aaaaaaaaaaaaaaaaabbbbbbbbbbbbbbfff",100));
    }
}

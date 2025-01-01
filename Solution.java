import java.util.*;

public class Solution {
    public int solve(String A, int B) {
        // Count the frequency of each character in the string
        int[] cnt = new int[26];
        for (char c : A.toCharArray()) {
            cnt[c - 'a']++;
        }

        // Store the frequency of each character in a priority queue (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int frequency : cnt) {
            if (frequency > 0) {
                pq.add(frequency);
            }
        }

        // Remove the elements from the priority queue until the sum of the elements is less than B
        while (!pq.isEmpty() && B >= pq.peek()) {
            B -= pq.poll();
        }
        
        // If the priority queue is empty, return 1
        if (pq.size()==0) {
            return 1;
        }
        // Return the number of elements left in the priority queue
        return pq.size();
    }
}

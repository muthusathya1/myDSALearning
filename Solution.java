import java.util.*;
// Definition for an interval.
 class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> output=new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {    //  Iterating through intervals
            Interval curr=intervals.get(i);             // Get current interval
            if (curr.end<newInterval.start) {           // IF: current interval is before the new interval
                output.add(curr);                           // Add the current interval
            }else if (newInterval.end<curr.start) {     // IF: new interval comes before current interval
                output.add(newInterval);                    // Add the new interval
                while (i<intervals.size()) {                // while the end comes
                    output.add(intervals.get(i));           // Keep adding the rest
                    i++;
                }
                return output;
            }else{
                int start=Math.min(newInterval.start, curr.start);
                int end=Math.max(newInterval.end, curr.end);
                while (end>intervals.get(i+1).start && i+1<=intervals.size()-1) {
                    i++;
                    end=Math.max(end, intervals.get(i+1).end);
                }
                if (i==intervals.size()) {
                    end=Math.max(end, intervals.get(intervals.size()-1).end);
                }
                end=Math.max(end, intervals.get(i).end);
                output.add(new Interval(start,end));

                while (i<intervals.size()) {                // while the end comes
                    output.add(intervals.get(i));           // Keep adding the rest
                    i++;
                }
                return output;
            }
        }
      
            output.add(newInterval);
            return output;

    }
}

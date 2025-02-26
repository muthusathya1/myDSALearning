import java.util.*;

/**
 * Definition for an interval.
**/
class Interval {

    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "["+start+","+end+"]";
    }
}


public class Solution {
      public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        ArrayList<Interval> output=new ArrayList<>();
        Interval curr=intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval interval=intervals.get(i);
            if (curr.end>=interval.start) {
                curr.end=Math.max(curr.end, interval.end);
            }else{
                output.add(curr);
                curr=interval;
            }
        }
        output.add(curr);
        return output;
    }
    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test case 1
        ArrayList<Interval> intervals1 = new ArrayList<>();
        intervals1.add(new Interval(1, 3));
        intervals1.add(new Interval(2, 6));
        intervals1.add(new Interval(8, 10));
        intervals1.add(new Interval(15, 18));
        ArrayList<Interval> result1 = solution.merge(intervals1);
        System.out.println("Merged intervals for test case 1: " + result1);

        // Test case 2
        ArrayList<Interval> intervals2 = new ArrayList<>();
        intervals2.add(new Interval(1, 4));
        intervals2.add(new Interval(4, 5));
        ArrayList<Interval> result2 = solution.merge(intervals2);
        System.out.println("Merged intervals for test case 2: " + result2);

        // Test case 3
        ArrayList<Interval> intervals3 = new ArrayList<>();
        intervals3.add(new Interval(1, 4));
        intervals3.add(new Interval(0, 2));
        intervals3.add(new Interval(3, 5));
        ArrayList<Interval> result3 = solution.merge(intervals3);
        System.out.println("Merged intervals for test case 3: " + result3);

        // Test case 4
        ArrayList<Interval> intervals4 = new ArrayList<>();
        intervals4.add(new Interval(1, 4));
        intervals4.add(new Interval(5, 6));
        ArrayList<Interval> result4 = solution.merge(intervals4);
        System.out.println("Merged intervals for test case 4: " + result4);
    }

}
public class Solution {
    public int maxArr(int[] A) {
        int max1=Integer.MIN_VALUE, min1= Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE, min2= Integer.MAX_VALUE;
        int max3=Integer.MIN_VALUE, min3= Integer.MAX_VALUE;
        int max4=Integer.MIN_VALUE, min4= Integer.MAX_VALUE;
        
        for (int i = 0; i < A.length; i++) {
            int val1=  A[i]+i;
            int val2=  A[i]-i;
            int val3= -A[i]+i;
            int val4= -A[i]-i;
            
            max1=Math.max(val1, max1);
            min1=Math.min(val1, min1); 

            max2=Math.max(val2, max2);
            min2=Math.min(val2, min2); 

            max3=Math.max(val3, max3);
            min3=Math.min(val3, min3); 

            max4=Math.max(val4, max4);
            min4=Math.min(val4, min4);

        }
        return Math.max(
            Math.max(
                max1-min1
                ,
                max2-min2
                ),
             Math.max(
                max3-min3
                ,
                max4-min4
                ));
    }
}

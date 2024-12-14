    public class Solution {
        public int solve(String A) {
            int zeroes=0;
            int totalOnes=0;
            int left=0;
            int right=0;
            int maxL=0;
            for (int i = 0; i < A.length(); i++) {
                if(A.charAt(i)=='1'){   
                    totalOnes++;
                }
            }
            if(totalOnes==A.length()){
                return totalOnes;
            }
            for(int i=0;i<A.length();i++){
                if (A.charAt(i)=='1') {
                    if (zeroes==1) {
                        right++;
                        // maxL= Math.max(maxL, left+right+((left+right)<totalOnes?1:0));
                        if (i==A.length()-1) {
                        maxL= Math.max(maxL, left+right+((left+right)<totalOnes?1:0));
                        }
                    }else{
                        left++;
                    }
                }else{
                    zeroes++;
                    if (zeroes==1) {
                    maxL= Math.max(maxL, left+((left+right)<totalOnes?1:0));
                    }else{
                        maxL= Math.max(maxL, left+right+((left+right)<totalOnes?1:0));
                        zeroes=1;
                        left=right;
                        right=0;
                    }
                }
            }
            return maxL;
        }
        
        
        }
        
        


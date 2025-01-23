public class Solution {
  
    public int solve(int A, long B){
        if (A==0) return 0;
        int parent= solve(A-1, B/2);
        if ((B%2==0 && parent==1) || (B%2==1 && parent==0)) {
            return 1;
        }else{
            return 0;
        }

    }
    public static void main(String[] args) {
        System.out.println(new Solution().solve(4, 4));
    }
}


// 0        0 0
// 01       1 1
// 0110     2 1
// 01101001 4 1
// 0110100110010110
// 01101001100101101001011001101001
//
// 0
//
//
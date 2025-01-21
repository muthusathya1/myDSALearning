public class Solution {
    public void solve(int A) {
       String toPrint="";
        printNumbers1toA(A,toPrint);
            }
        
            private void printNumbers1toA(int A, String toPrint) {
                if (A==1) {
                  System.out.println(A+toPrint);
                    return;
                }

                printNumbers1toA(A-1, " "+A+toPrint);

            }

            public static void main(String[] args) {
                new Solution().solve(10);
            }
}

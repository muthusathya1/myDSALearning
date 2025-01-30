
public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] beggars=new int[A];
        for (int i = 0; i < B.length; i++) {
            beggars[B[i][0]-1]+=B[i][2];
            if(B[i][1]<A) beggars[B[i][1]]-=B[i][2];
        }
        for (int i = 1; i < beggars.length; i++) {
            beggars[i]=beggars[i]+beggars[i-1];
        }
        return beggars;
    }
}



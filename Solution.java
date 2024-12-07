public class Solution {
    public int[] sortColors(int[] A) {
     int i = 0;
       int j = 0;
       int index = 0;
       int color = 0;
       while (i < A.length){
           if(j < A.length){
               if(A[j] != color){
                   j++;
               }else {
                   swap(A,i, j);
                   index++;
                   i++;
                   j++;
               }

           }

           if(j == A.length){
               color++;
               i=index;
               j=index;
           }
       }
       return A;
   }

    private void swap(int[] arr, int a, int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
   }
}




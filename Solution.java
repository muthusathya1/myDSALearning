import java.util.ArrayList;
import java.util.Random;

public class Solution {
    public static ArrayList<Integer> sort(ArrayList<Integer> A){
        
        mergeSort(A,0,A.size()-1);
        
        return A;
    } 
        
    private static void mergeSort(ArrayList<Integer> a, int s, int e) {
        if(s<e){
            int middle=(s+e)/2;
            mergeSort(a, s, middle);
            mergeSort(a,middle+1,e);
            sortArray(a,s,e,middle);
        }
                
    }
                    
    private static void sortArray(ArrayList<Integer> a, int s, int e, int middle) {
        ArrayList<Integer> leftArray=new ArrayList<>();
        ArrayList<Integer> rightArray=new ArrayList<>();
        for (int i = s; i <=e; i++) {
            if(i<=middle){
                leftArray.add(a.get(i));
            }else{
                rightArray.add(a.get(i));
            }
        }
        int l=0;
        int r=0;
        for (int i = s; i <=e ; i++) {
            if (l<leftArray.size() && r<rightArray.size()) {
                if (leftArray.get(l)<=rightArray.get(r)) {
                    a.set(i,leftArray.get(l));
                    l++;
                }else{
                    a.set(i, rightArray.get(r));
                    r++;
                }    
            }else{
                if (l<leftArray.size()) {
                    a.set(i, leftArray.get(l));
                    l++;
                }else if (r<rightArray.size()) {
                    a.set(i, rightArray.get(r));
                    r++;
                }
            }
            
        }
    
    }                           
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=randomArray(10);
        System.out.println(arrayList.toString());
        System.out.println(sort(arrayList).toString());
    }
    public static ArrayList<Integer> randomArray(int size){
        Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int index = 0; index < size; index++) {
            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }

}
import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10}, b = {2, 3};
        System.out.println(Arrays.toString(mergeSortedArrays(a, b)));
    }
    public static int[] mergeSortedArrays(int[] a, int[] b){
        int lengthA = a.length;
        int lengthB = b.length;
        int[] merged = new int[lengthA+lengthB];
        int i=0, j=0, k=0;
        while(i<lengthA && j<lengthB){
            if(a[i] <= b[j]){
                merged[k] = a[i];
                i++;
                k++;
            }
            else{
                merged[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<lengthA){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<lengthB){
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }
}

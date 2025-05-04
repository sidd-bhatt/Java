import java.util.Arrays;

public class ReverseSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseSubArray(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseSubArray(int[] arr, int k) {
        //This will increase the i by the value of k, effectively shifting the index of next sub array by k
        for(int i=0; i<arr.length; i+=k){
            //Makes sure that shifted index value is less than the total array length
            if(i+k-1 < arr.length){
                reverse(arr, i, k+i-1);
            }
            else{
                reverse(arr, i, arr.length-1);
            }
        }
    }
    //This is simple reverse function
    private static void reverse(int[] arr, int start, int end){
        //The end is inclusive
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

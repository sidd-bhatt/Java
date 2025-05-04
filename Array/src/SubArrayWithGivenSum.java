import java.util.Arrays;

public class SubArrayWithGivenSum
{
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int[] result = (subArrayWithSum(arr, 33));
        System.out.println("Sub array indecies "+ Arrays.toString(result));
    }

    public static int[] subArrayWithSum(int[] arr, int targetSum) {
        int length = arr.length;
        int sum = 0;
        int start = 0;
        //Loop to locate the sum which is equal or greater than the target sum/
        for(int end=0; end<length; end++) {
            sum += arr[end];
            //loop to shift the starting index towards end if sum becomes greater than target sum
            while(sum > targetSum && start <= end){
                sum -= arr[start];
                start++;
            }
            if(sum == targetSum){
                return new int[]{start, end};
            }
        }
        return new int[]{-1};
    }
}

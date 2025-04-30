import java.util.Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibriumPoint(arr));
    }
    public static int equilibriumPoint(int[] arr){
        int totalSum = Arrays.stream(arr).reduce(0,(x, y)->x+y);
        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            if(leftSum == totalSum-leftSum-arr[i]){
                return i+1;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}

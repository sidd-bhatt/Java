import java.util.Arrays;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingElement(arr));
    }
    public static int missingElement(int[] arr){
        int n = arr.length + 1;
        //the sum of consecutive number formula
        int totalSum = (n* (n+1))/2;
        int sumOfArray = Arrays.stream(arr).reduce(0,(x,y)->x+y);
        return totalSum-sumOfArray;
    }
}

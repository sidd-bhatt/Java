import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        System.out.println(Arrays.toString(rearrangeArrayAlternately(arr)));
    }
    public static int[] rearrangeArrayAlternately(int[] arr){
        int n = arr.length;
        int maxIdx = n - 1; // index of last element
        int minIdx = 0;     // index of first element
        int maxElem = arr[maxIdx] + 1; // Store numbers > all elements

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index: put maximum element
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                // Odd index: put minimum element
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }
        // Now, get actual values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
        return arr;
    }
}

public class KadaneMaxSumOfSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadaneAlgo(arr));
    }
    public static int kadaneAlgo(int[] arr){
        int length = arr.length;
        int maxSoFar = 0;
        int currentMax = 0;
        for( int i = 1; i<length; i++){
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingTriplets {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        System.out.println("Triplets count "+countingTriplets(arr));
    }
    public static int countingTriplets(int[] arr){
        int length = arr.length;
        Set<Integer> frequency = new HashSet<>();
        Set<String> triplets = new HashSet<>();
        for(int num: arr){
            frequency.add(num);
        }
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                int sum = arr[i] + arr[j];
                if(frequency.contains(sum)){
                   int[] triplet = {arr[i], arr[j], sum};
                    Arrays.sort(triplet);
                    String key = triplet[0]+","+triplet[1]+","+triplet[2];
                    triplets.add(key);
                }
            }
        }
        return triplets.size();
    }
}

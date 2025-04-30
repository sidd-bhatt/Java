import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(minimumPlatform(arrival, departure));
    }

    private static int minimumPlatform(int[] arrival, int[] departure) {
        int length = arrival.length;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int a = 0, d = 0;
        int platform = 0;
        int minPlatform = 0;
        while(a<length && d<length){
            //Train arrived
            if(arrival[a] <= departure[d]){
                platform++;
                minPlatform = Math.max(platform,minPlatform);
                a++;
            }
            //Train left
            else{
                platform--;
                d++;
            }
        }
        return minPlatform;
    }
}

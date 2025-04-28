package Arrays;

import java.util.Arrays;

public class LargestConcatNumberInArray {

    static String largest(int[] arr){
        /*
        * convert int array to string array
        * mapToObj converts primitive data type value into object which I have given to be String
        * toArray is terminal function which form array from stream
        */
        String[] stringArray = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);

        /*
        * Now I sorted the array in a way where I compared two consecutive value lexicographically
        */
        Arrays.sort(stringArray, (a,b) -> (b+a).compareTo(a+b));
        return String.join("",stringArray);
    }

    public static void main(String[] args){
        int[] array = {3, 30, 34, 5, 9};
        System.out.println(largest(array));
    }
}

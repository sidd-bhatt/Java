import java.util.HashSet;

public class LongestSubStrDistinctChar {
    public static void main(String[] args) {
        String str = "abcdefabcbb";
        System.out.println(longestSubStrDistinctChar(str));
    }
    /*
     * This algorithm uses the Sliding Window technique.
     * The right pointer expands the window by moving forward through the string
     * as long as all characters in the window are distinct.
     * When a duplicate character is encountered, the left pointer moves forward
     * to shrink the window until the duplicate is removed.
     * This ensures the window always contains unique characters.
     */
    private static int longestSubStrDistinctChar(String str){
        int max = 0, left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < str.length(); right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}

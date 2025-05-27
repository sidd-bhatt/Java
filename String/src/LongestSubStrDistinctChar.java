import java.util.HashSet;

public class LongestSubStrDistinctChar {
    public static void main(String[] args) {
        String str = "abcdefabcbb";
        System.out.println(longestSubStrDistinctChar(str));
    }

    private static int longestSubStrDistinctChar(String str){
        int max = 0;
        int count = 0;
        HashSet <Character> hashSet = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            if(!hashSet.contains(str.charAt(i))){
                hashSet.add(str.charAt(i));
                count++;
                max = Math.max(count, max);
            }
            else{
                count = 0;
                hashSet.clear();
            }
        }
        return max;
    }
}

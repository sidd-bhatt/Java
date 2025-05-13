import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        System.out.println(isAnagram(s1,s2));
    }
    private static Boolean isAnagram(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        //If length of two string are not equal then they are not anagram
        if(n1!=n2) return false;
        int[] arr = new int[26];
        for(int i=0;i<n1;i++){
            //Make the specific index of array as per alphabet of string 1 increment by 1
            arr[s1.charAt(i)-'a']++;
            //Make the specific index of array as per alphabet of string 2 decrement by 1
            arr[s2.charAt(i)-'a']--;
        }
        //In the end if all elements of array is 0 then its anagram
        return Arrays.stream(arr).allMatch(n->n==0);
    }
}

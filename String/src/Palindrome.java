public class Palindrome {
    /*
     * A palindrome is symmetric around its center. The center can be:
     * 1) A single character (odd-length palindromes, e.g., "aba")
     * 2) The gap between two characters (even-length palindromes, e.g., "abba")
     *
     * For each index in the string, the algorithm treats it as a potential center
     * and expands outward in both directions while the characters match.
     * The longest palindrome found during this process is tracked and returned.
     *
     * This approach avoids checking all substrings and runs in O(n²) time
     * with O(1) extra space.
     */

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     // odd-length
            int len2 = expandFromCenter(s, i, i + 1); // even-length
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // final length
    }
    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest Palindrome: " + longestPalindrome(input));
    }
}

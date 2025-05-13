public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "ace";
        String s2 = "abcde";
        System.out.println(lcs(s1,s2));
    }
    private static int lcs(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++) {
                //if letter of two string at this position is equal
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    //Increment the left-top diagonal of current position in matrix by 1
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    //Give the max value between top or left of the current position in matrix
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}

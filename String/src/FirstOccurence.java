public class FirstOccurence {
    public static void main(String[] args) {
        String str = "siddharth bhatt";
        String pat = "bhatt";
        System.out.println(firstOccurence(str, pat));
    }

    private static int firstOccurence(String str, String pat){
        int patLength = pat.length();
        int strLength = str.length();
        if(str == "" || pat == "") return -1;
        for(int i=0; i<=(strLength-patLength); i++){
            if(str.substring(i,i+patLength).equals(pat)){
                return i;
            }
        }
        return -1;
    }
}

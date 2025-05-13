public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Siddharth";
        System.out.println(removeDuplicates(str));
    }
    private static String removeDuplicates(String str){
        boolean[] seen = new boolean[256];
        StringBuilder newStr = new StringBuilder();
        for(char c: str.toCharArray()){
            //In seen[c] java internally take the ASCII value(integer) of character,eg: seen[int(c)]
            if(!seen[c]){
                seen[c]=true;
                newStr.append(c);
            }
        }
        return newStr.toString();
    }
}

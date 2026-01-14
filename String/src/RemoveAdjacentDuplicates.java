import java.util.Arrays;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeAdjacentDuplicates(str));

    }
    private static String removeAdjacentDuplicates(String str) {
        char[] charArray = str.toCharArray();
        int index = 0;

        for(int i=0;i<str.length();i++){
            charArray[index]=charArray[i];
            if(index > 0 && charArray[index] == charArray[index-1]){
                index-=2;
            }
            index++;
        }
        return Arrays.toString(charArray);
    }
}

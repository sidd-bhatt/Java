public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Listen my home is the most peaceful place I can be";
        System.out.println(reverse(str));
    }
    private static String reverse(String str){
        //First trim the leading and end spaces, if any then split the string into array
        String[] words = str.trim().split("\\s+");
        int length = words.length;
        //Run the loop only till half the length or array.
        for(int i=0; i<length/2; i++){
            //Do the swapping
            String temp = words[i];
            words[i] = words[length-i-1];
            words[length-i-1] = temp;
        }
        return String.join(" ", words);
    }
}

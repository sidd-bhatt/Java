public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "aaaaaaaavvfghghg";
        System.out.println(removeAdjacentDuplicates(str));

    }
    private static String removeAdjacentDuplicates(String str){
        //If String is null or it has only one character left then no recursion needed
        if(str == null || str.length()<=1){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        //We'll loop across the string.
        while(i<str.length()){
            //Make one comparing pointer.
            int j = i;
            //This loop will pass through the adjacent duplicates, if found.
            while(j+1 < str.length() && str.charAt(i) == str.charAt(j+1)){
                j++;
            }
            //This is when the next character is not duplicate, we'll keep that.
            if(i == j){
                sb.append(str.charAt(i));
            }
            //This is how we'll increment because in case when there are duplicates
            // and j would have incremented then we need to skip duplicates
            i = j+1;
        }
        //After the loop
        String newString = sb.toString();
        //So after while loop same string is returned as what is passed, it means no duplicates remaining.
        if(newString.length() == str.length()){
            return newString;
        }
        //If condition fails that mean there is a possibility of duplicate, again do the process.
        return removeAdjacentDuplicates(newString);
    }
}

public class RotateByK {
    public static void main(String[] args) {
        String str = "siddharth";
        System.out.println(rotateLeft(str, 4));
        System.out.println(rotateRight(str, 4));
    }
    private static String rotateLeft(String str, int k){
        int length = str.length();
        if(k == 0 || length == 0){
            return str;
        }
        //This is for case where k is greater than n.
        k = k % length;
        return str.substring(k) + str.substring(0,k);
    }
    private static String rotateRight(String str, int k){
        int length = str.length();
        if(k == 0 || length == 0){
            return str;
        }
        //This is for case where k is greater than n.
        k = k % length;
        return str.substring(length-k) + str.substring(0,k);
    }
}

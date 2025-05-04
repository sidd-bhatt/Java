public class ArrayLeader {
    public static void main(String[] args) {
        int[] arr = {30, 10, 10, 5};
        arrayLeader(arr);
    }
    public static void arrayLeader(int[] arr){
        int length = arr.length;
        int max = 0;
        for(int i = length-1; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}

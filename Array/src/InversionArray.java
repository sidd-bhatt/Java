public class InversionArray {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        System.out.println(inversionArray(arr));
    }
    public static int inversionArray(int[] arr){
        int length = arr.length;
        int count = 0;
        for(int i=0; i<length-1; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

public class Permutation {
    public static void main(String[] args) {
        String str = "ABCD";
        permute(str.toCharArray(), 0);
    }

    // Recursive function to generate permutations
    static void permute(char[] chars, int index) {
        //Base condition: goes only till the height of the tree
        if (index == chars.length - 1) {
            System.out.println(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);                 // Swap current index with i
            permute(chars, index + 1);       // Recurse for next index
            swap(chars, index, i);                 // Backtrack
        }
    }

    // Swap utility
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package programming;

import java.util.Arrays;

public class FP4_Stream_Reduce {

    public static void main(String args[]) {
        int number[] = {12, 13, 4, 9, 22, 27, 16, 15, 5};
        sum(number);
        max(number);
        min(number);
    }

    public static void sum(int number[]) {
        System.out.println("Sum is "+Arrays.stream(number).reduce(0,(x,y)->x+y));
    }
    public static void max(int number[]){
        System.out.println("Maximum number is "+Arrays.stream(number).reduce(0,(x,y)->x>y?x:y));
    }
    public static void min(int number[]){
        System.out.println("Minimum number is "+Arrays.stream(number).reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y));
    }
}

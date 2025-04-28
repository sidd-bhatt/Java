package programming;

import java.util.Arrays;
import java.util.List;

public class FP5_Stream_Sorted {
    public static void main(String args[]) {
        int number[] = {12, 13, 4, 9, 22, 27, 16, 15, 5};
        List<String> names = List.of("siddharth", "kriti", "lim", "shruti", "nanni", "mumma", "papa");
        sortNumber(number);
        sortName(names);
    }



    private static void sortName(List<String> names) {
        names.stream().sorted().forEach(System.out::println);
    }

    public static void sortNumber(int number[]) {
        Arrays.stream(number).sorted().forEach(System.out::println);
    }
}

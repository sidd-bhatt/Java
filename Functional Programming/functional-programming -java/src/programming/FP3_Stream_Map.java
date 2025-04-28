package programming;

import java.util.Arrays;
import java.util.List;

public class FP3_Stream_Map {

    public static void main(String args[]){
        int number[]={12,13,4,9,22,27,16,15,4};
        List<String> subject=List.of("maths","history","chemistry","physics","english","arts");
        System.out.println("Printing squares of all numbers");
        Arrays.stream(number).map(n->n*n).forEach(System.out::println);
        System.out.println("Printing number of characters in all course name");
        subject.stream().map(s->s.length()).forEach(System.out::println);
    }
}

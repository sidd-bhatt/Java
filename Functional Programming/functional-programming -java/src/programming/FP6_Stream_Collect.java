package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP6_Stream_Collect {
    public static void main(String args[]){
        List<Integer> numbers=List.of(3,8,45,98,213,54,32,7);
        System.out.println(listOfSquaredNumber(numbers));
    }

    private static List<Integer> listOfSquaredNumber(List<Integer> numbers) {
        return numbers.stream().map(x->x*x).collect(Collectors.toList());
    }
}

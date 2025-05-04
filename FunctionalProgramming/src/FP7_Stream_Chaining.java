import java.util.List;
import java.util.stream.Collectors;

public class FP7_Stream_Chaining {
    public static void main(String args[]) {
        List<Integer> number = List.of(12, 13, 4, 9, 22, 27, 16, 15, 5);
        System.out.println(sqauredEvenNumber(number));
    }

    private static List<Integer> sqauredEvenNumber(List<Integer> number) {
        return number.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
    }
}

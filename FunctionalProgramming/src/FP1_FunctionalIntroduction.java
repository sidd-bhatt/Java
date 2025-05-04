import java.util.List;

public class FP1_FunctionalIntroduction {
    public static void main(String args[]){
        printAllNumberInListFunctional(List.of(12,65,34,98,22));
        printEvenNumberInListFunctional(List.of(12,65,34,98,22));
    }
    private static void printAllNumberInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }
    private static void printEvenNumberInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(number->number%2==0).forEach(System.out::println);
    }
}

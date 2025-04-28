package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP2_Stream_Filter {

    public static void main(String args[]){
        List<String> subject=List.of("maths","history","chemistry","physics","english","arts");
        subject.stream().forEach(System.out::println);
        System.out.println("Subject with 5 or less than 5 alphebets");
        subject.stream().filter(sub->sub.length()<=5).forEach(System.out::println);
        System.out.println("Filtering out Maths subject only");
        subject.stream().filter(s->s.equalsIgnoreCase("maths")).forEach(System.out::println);
    }

}

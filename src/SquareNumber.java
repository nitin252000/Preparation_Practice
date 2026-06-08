import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {
    public static void main(String[] args) {
        List<Integer> ar= Arrays.asList(1,2,3,2,13,12,28);
        ar.stream().distinct().filter(l->l%2==0).map(n->n*n).forEach(System.out::println);
        ar.stream().filter(n-> Collections.frequency(ar,n)>1).collect(Collectors.toList()).forEach(System.out::println);
    }
}

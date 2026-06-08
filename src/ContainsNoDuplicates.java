import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsNoDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 1, 7);
        List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()

                .filter(entry -> entry.getValue() == 1)

                .map(Map.Entry::getKey)

                .collect(Collectors.toList());
        System.out.println(duplicates);
    }
}

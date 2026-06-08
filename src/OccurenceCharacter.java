import java.util.*;
import java.util.stream.Collectors;

public class OccurenceCharacter {
    public static void main(String[] args) {
        String s="hello";
        Map<Character,Long>map=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s1->s1,Collectors.counting()));
        System.out.println(map);
        List<Integer>l= Arrays.asList(12,31,34,123,4,2);
        Integer q=l.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(null);
    }
}

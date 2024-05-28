import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1,3,4);
        List<Integer> lst2 = Arrays.asList(6,5,7);
        List<Integer> lst3 = Arrays.asList(8,2,9);

        List<List<Integer>> newList = Arrays.asList(lst1,lst2,lst3);
        List<Integer> res = newList.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println(res);
        List<Integer> temp = res.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(temp);
    }
}


//FLatMap will convert the lists into collection to make it use for stream methods
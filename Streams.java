import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {
       ArrayList<String> lst = new ArrayList<>(Arrays.asList("Ram","Sam","Kavi","Kavi","Surya"));
       Collection<String> lst1 = lst.stream()                          //Convert the list to stream
               .filter(n -> n.length()>2 && n.length() <= 4)           //Filter the objects using the condition
               .map(n -> n.toUpperCase())                              //map is used to perform operations and methods for the object
               .distinct()                                             //Distinct to give unique values
               .sorted(Comparator.comparingInt(String::length))        //Sorted is for sorting it in ascending order
               .collect(Collectors.toList());                          //Convert output to List.
       lst1.forEach(n -> System.out.println(n));

       Collection<Integer> nums = Stream.of(1,2,34,5,76,2,77,95)     //of method for create it in Stream
               .filter(n ->n%2==0)
               .map(n-> n*2)
               .collect(Collectors.toSet());                        //convert output to Set
       nums.forEach(n -> System.out.println(n));

       int result = Arrays.asList(3,4,15,56,7,65,89,45,15,75).stream()
               .filter(n ->n % 3==0 && n % 5 == 0)
               .sorted()
               .distinct()
               .reduce((n,e) -> n + e ).orElse(0);          //reduce give one value operation
       System.out.println(result);

        int res = (int) Arrays.asList(3,4,15,56,7,65,89,45,60,15,75).stream()
                .filter(n ->n % 3==0 && n % 5 == 0)

                .distinct()
                .count();                                       //count of element in list
        System.out.println(res);
    }
}

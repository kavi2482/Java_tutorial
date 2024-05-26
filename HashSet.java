
import java.util.*;

public class Main {

        public static void main(String[] args)
        {
            HashSet<Integer> num = new HashSet<>();
            List<Integer> lst1 = new LinkedList<>(Arrays.asList(45,55,66,88,99));
            num.add(5);
            System.out.println(num);
            num.addAll(lst1);
            System.out.println(num);
          //  Collections.sort(num);      //not possible in HashSet

         //   Collections.shuffle(num);   //not possible in HashSet

         //   System.out.println(num.get(4));    //not possible in HashSet
         //   num.set(3,77);             //not possible in HashSet
            System.out.println(num.size());
            System.out.println(num);
            num.retainAll(Arrays.asList(5,77,99));
            System.out.println(num);
            num.removeAll(Arrays.asList(5,77));
            System.out.println(num);
            num.add(33);
            System.out.println(num);
            num.clear();
            System.out.println(num);
            System.out.println(num.contains(99));
            System.out.println(num.isEmpty());
            num.addAll(lst1);

            System.out.println(num);

        }
    }

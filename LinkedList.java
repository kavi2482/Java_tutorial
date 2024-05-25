
import java.util.*;

public class Main {

        public static void main(String[] args)
        {
            List<Integer> num = new LinkedList<>();
            List<Integer> lst1 = new LinkedList<>(Arrays.asList(45,55,66,88,99));
            num.add(0,5);
            System.out.println(num);
            num.addAll(1,lst1);
            System.out.println(num);
            Collections.sort(num);
            System.out.println(num);
            Collections.shuffle(num);
            System.out.println(num);
            System.out.println(num.get(4));
            num.set(3,77);
            System.out.println(num);
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
            num.addFirst(100);
            num.addLast(200);
            System.out.println(num);
            num.removeFirst();
            num.removeLast();
            System.out.println(num);
            System.out.println(num.getFirst());
            System.out.println(num.getLast());

        }
    }
